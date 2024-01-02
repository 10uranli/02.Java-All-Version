package java9.unit_7;

import lombok.Getter;

public class _07ExecuteClass {

	public static void main(String[] args) {

		AllType<Integer> integerAllType = new AllType<>(9){
			@Override
			void callMe() {
				System.out.println(getType());
				String info = getInfo();
				System.out.println(info);
			}
		};
		integerAllType.callMe();
		System.out.println("******************************");
		AllType<String> stringAllType = new AllType<>("Hi guys"){
			@Override
			void callMe() {
				System.out.println(getType());
				String info = getInfo();
				System.out.println(info);
			}
		};
		stringAllType.callMe();
		System.out.println("******************************");
		AllType<?> allType = new AllType<Object>("All Type") {

			@Override
			void callMe() {
				System.out.println(getType());
				String info = getInfo();
				System.out.println(info);
			}
		};
		allType.callMe();
		System.out.println("******************************");
	}

}
@Getter
abstract class AllType<T>{
	public T type;
	public AllType(T type) {
		this.type = type;
	}

	public String getInfo(){
		String value = "Farkli bir tip geldi.";
		if (type instanceof Integer){
			value = "Gelen integer degeri " + type;
		} else if (type instanceof String) {
			value = "Gelen string degeri "  + ((String) type).toUpperCase();
		}
		return value;
	}
	abstract void callMe();
}

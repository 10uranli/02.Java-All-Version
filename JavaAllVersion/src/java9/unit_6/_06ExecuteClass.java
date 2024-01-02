package java9.unit_6;

public class _06ExecuteClass {

	public static void main(String[] args) {
			sayHello();//Warning:(13, 21) Deprecated member 'sayHello' is still used

	}

	@Deprecated(
			forRemoval = true, since = "1.0"
	)
	public static void sayHello(){
		System.out.println("Hello");
	}
}

package java8.unit_1;

public class Dog implements IAnimal{

	@Override
	public String sound(String str) {
		return str;
	}

	@Override
	public void other() {
			System.out.println("Ben bir köpeðim");
	}
	
}

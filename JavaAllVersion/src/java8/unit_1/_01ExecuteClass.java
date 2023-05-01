package java8.unit_1;

public class _01ExecuteClass {

	public static void main(String[] args) {

		System.out.println("****OOP ile her �ey interface ve s�n�fla yap�l�yor.�e�itlilik bunla sa�lan�yor****");
		IAnimal dog = new Dog();
		dog.other();

		System.out.println("*******Lambda ile yap�lan*********");

		ILambda withLambda = () -> System.out.println("hav..");
		withLambda.other();

		System.out.println("*******Innerclass ile yap�lan*********");
		ILambda withInnerClass = new ILambda() {
			@Override
			public void other() {
				System.out.println("Innerclass: Ben bir k�pe�im");

			}
		};
		withInnerClass.other();

		System.out.println("*******Param ile yap�lan*********");
		ILambda_With_Param withLambda_Param = (x) -> (x);
		System.out.println(withLambda_Param.other_string("With Params"));

		Math add = (a, b) -> (a + b);
		System.out.println(add.math(4, 5));

		Math sub = (a, b) -> (a - b);
		System.out.println(sub.math(4, 5));
		/*
		 * ****OOP ile her �ey interface ve s�n�fla yap�l�yor.�e�itlilik bunla
		 * sa�lan�yor**** Ben bir k�pe�im Lambda ile yap�lan********* hav..
		 ******* Innerclass ile yap�lan********* Innerclass: Ben bir k�pe�im Param ile
		 * yap�lan********* With Params 9 -1
		 * 
		 */

	}

	@FunctionalInterface
	interface ILambda {
		public void other();
	}

	interface ILambda_With_Param {
		public String other_string(String arg);
	}

	interface Math {
		public int math(int a, int b);
	}

}

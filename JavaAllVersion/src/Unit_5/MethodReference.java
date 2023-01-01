package Unit_5;

public class MethodReference {

	public static void main(String[] args) {
		
		ITemp temp = () -> sayHello();
		temp.tempMethod();
		
		ITemp temp2 = MethodReference :: sayHello;
		temp2.tempMethod();
		
//		() -> sayHello() == MethodReference :: sayHello
		
		ITemp temp3 = () -> System.out.println("Hello");
		temp3.tempMethod();
		
		//  System.out :: println;
	}
	
	public static void sayHello(){
		System.out.println("Hello World!!");
	}
	 
}
interface ITemp{
	public void tempMethod();
}
package java16.unit_1;


public class _01ExecuteClass {

	public static void main(String[] args) {
			Person customer = new Customer("Onur",30);
			Employee employee = new Employee(1,"Selim", 24);

			System.out.println(customer.getInfo());
			System.out.println(employee.getInfo());


	}

}



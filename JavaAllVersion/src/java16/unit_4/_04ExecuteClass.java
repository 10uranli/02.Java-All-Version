package java16.unit_4;


import static java.lang.System.out;

public class _04ExecuteClass {

	public static void main(String[] args) {
		Insurance insurance = new Insurance("Dask", "Deprem Sigortasi",1 );

		System.out.println(insurance.name() + " " + insurance.equals(insurance) + " " +
				insurance.getClass() + " " +  insurance.toString());
	}

}



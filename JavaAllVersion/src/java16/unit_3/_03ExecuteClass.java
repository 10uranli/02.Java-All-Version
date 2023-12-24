package java16.unit_3;


import java16.unit_2.Dask;
import java16.unit_2.Insurance;
import java16.unit_2.Vehicle;

import static java.lang.System.out;

public class _03ExecuteClass {

	public static void main(String[] args) {
		Double sayi = 1.0;
		synchronized (sayi){
			out.println(sayi);
		}
//		Attempt to synchronize on an instance of a value-based class
//Synchronization on local variable 'sayi'
	}



}



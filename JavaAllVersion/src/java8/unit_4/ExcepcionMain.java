package java8.unit_4;

import java.util.function.BiConsumer;

public class ExcepcionMain {

	public static void main(String[] args) {

		int numbers [] = {1,2,3,4,5};
		
//		div(numbers, (a,b) -> System.out.println(a/b)); yerine aþaðýdaki gibi exception yakalanabilir.Bunun yerine daha kullanýlabilir yöntem wrapper.
		
		div(numbers, (a,b) -> {
			try {
				System.out.println(a/b);
			} catch (ArithmeticException e) {
				System.out.println("Exception");
			}
			
		});
		
	}
	
	/*
	 * Biconsumer func. inter. java tarafýndan bize saðlanan 2 parametre alan ve void dönüþ tipinde bir method a sahip
	 * exceptionu aþaðýda methodu çaðýran yerde yakalayýp klasik try catch ile yaparýz ama spesifik bir hata olarak yakalamaya çalýþýrsak bu sefer null pointer
	 * vs gibi baþka yerlerden gelebilecek hatalarý yakalayamayabiliriz.Sonucta gelecek iþlem türünü bilmiyoruz.
	 * Bundan dolayý yukarýda iþlemi yapan kiþi tarafýndan yakalanmasý mantýklýdýr.
	 * */
	private static void div(int[] numbers, BiConsumer<Integer,Integer> biconsumer) {
		
		for (int i : numbers) {
			biconsumer.accept(i, 0);
		}
	}
	
}

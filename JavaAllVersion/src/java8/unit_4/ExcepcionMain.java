package java8.unit_4;

import java.util.function.BiConsumer;

public class ExcepcionMain {

	public static void main(String[] args) {

		int numbers [] = {1,2,3,4,5};
		
//		div(numbers, (a,b) -> System.out.println(a/b)); yerine a�a��daki gibi exception yakalanabilir.Bunun yerine daha kullan�labilir y�ntem wrapper.
		
		div(numbers, (a,b) -> {
			try {
				System.out.println(a/b);
			} catch (ArithmeticException e) {
				System.out.println("Exception");
			}
			
		});
		
	}
	
	/*
	 * Biconsumer func. inter. java taraf�ndan bize sa�lanan 2 parametre alan ve void d�n�� tipinde bir method a sahip
	 * exceptionu a�a��da methodu �a��ran yerde yakalay�p klasik try catch ile yapar�z ama spesifik bir hata olarak yakalamaya �al���rsak bu sefer null pointer
	 * vs gibi ba�ka yerlerden gelebilecek hatalar� yakalayamayabiliriz.Sonucta gelecek i�lem t�r�n� bilmiyoruz.
	 * Bundan dolay� yukar�da i�lemi yapan ki�i taraf�ndan yakalanmas� mant�kl�d�r.
	 * */
	private static void div(int[] numbers, BiConsumer<Integer,Integer> biconsumer) {
		
		for (int i : numbers) {
			biconsumer.accept(i, 0);
		}
	}
	
}

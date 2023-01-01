package unit_4;

import java.util.function.BiConsumer;

public class WrapperException {

	public static void main(String[] args) {
		int numbers[] = { 1, 2, 3, 4, 5 };
		
		div(numbers, wrapper((a,b) -> System.out.println(a/b))); 


	}

	private static void div(int[] numbers, BiConsumer<Integer, Integer> biconsumer) {

		for (int i : numbers) {
			biconsumer.accept(i, 0);
		}
	}
	
	private static BiConsumer<Integer,Integer> wrapper(BiConsumer<Integer, Integer> biConsumer){
		return (v, k) -> {
			try {
				biConsumer.accept(v, k);
			} catch (ArithmeticException e) {
				System.out.println("Wrapper Catch..");
			}
		};
	}
}

package java9.unit_5;



import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05ExecuteClass {

	public static void main(String[] args)  {
		Stream<String> streamList = Stream.of("onur", "dilan", "utku", "huseyin", "", "deger yazilmayacak");
		//takeWhile predicate true oldugu surece alir
		streamList.takeWhile(s->!s.isEmpty())
				.forEach(System.out::println);

		//dropWhile predicate true oldugu surece siler
		Stream.of("a","b","c","","e","f").dropWhile(s-> !s.isEmpty())
				.forEach(System.out::print);

		Stream.of("a","b","c","","e","","f").dropWhile(s-> !s.isEmpty())
				.forEach(System.out::print);
	   //iterate
		IntStream.iterate(1, x -> x < 20, x -> x+ 3).forEach(System.out::println);
		//ofNulLable


		Optional<String> onur = Stream.ofNullable("Onur").findFirst();
		System.out.println(onur);//Optional[Onur]
		Optional<Object> nullValue = Stream.ofNullable(null).findFirst();
		System.out.println(nullValue);//Optional.empty

	}

}

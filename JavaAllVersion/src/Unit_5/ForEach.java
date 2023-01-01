package Unit_5;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a","b","c");
		list.forEach(p -> System.out.println(p));
		System.out.println("******");
		list.forEach(System.out::println);
	}
}

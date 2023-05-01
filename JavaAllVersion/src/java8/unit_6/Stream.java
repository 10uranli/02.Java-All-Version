package java8.unit_6;

import java.util.Arrays;
import java.util.List;

public class Stream {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a","b","c","ca","cb");
		list.stream().filter(p -> p.startsWith("c")).forEach(p->System.out.println(p));//cesitli yeni yapýlar saðlýyor
		
	}
}

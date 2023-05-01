package java8.unit_6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		System.out.println("****Belli bir harf ile baslayanlarý filtrele ve yaz****");
		List<String> list = Arrays.asList("a","b","c","ca","cb");
		list.stream().filter(p -> p.startsWith("c")).forEach(p->System.out.println(p));//cesitli yeni yapýlar saðlýyor


		System.out.println("****Akan datanýn hepsini büyüt ve C' ye eþit olaný yazdýr****");
		list.stream().map(a -> a.toUpperCase()).filter(a -> a.equals("C")).forEach(a->System.out.println(a));


		System.out.println("****Akan datanýn hepsine xxx ekle ve c' ye eþit olaný listeleye at, sonra tek tek yazdýr.****");
		List<String> c = list.stream().map(a -> a + "xxx").filter(s -> s.startsWith("c")).collect(Collectors.toList());
		c.forEach(System.out::println);
	}
}

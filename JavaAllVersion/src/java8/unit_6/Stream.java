package java8.unit_6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		System.out.println("****Belli bir harf ile baslayanlar� filtrele ve yaz****");
		List<String> list = Arrays.asList("a","b","c","ca","cb");
		list.stream().filter(p -> p.startsWith("c")).forEach(p->System.out.println(p));//cesitli yeni yap�lar sa�l�yor


		System.out.println("****Akan datan�n hepsini b�y�t ve C' ye e�it olan� yazd�r****");
		list.stream().map(a -> a.toUpperCase()).filter(a -> a.equals("C")).forEach(a->System.out.println(a));


		System.out.println("****Akan datan�n hepsine xxx ekle ve c' ye e�it olan� listeleye at, sonra tek tek yazd�r.****");
		List<String> c = list.stream().map(a -> a + "xxx").filter(s -> s.startsWith("c")).collect(Collectors.toList());
		c.forEach(System.out::println);
	}
}

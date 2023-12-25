package java9.unit_2;

import java.util.*;

public class _02ExecuteClass {

	public static void main(String[] args){


		List<String> names = new ArrayList<>();
		names.add("Onur");
		names.add("Dilan");
		names = Collections.unmodifiableList(names);
		//names.add("sadasd"); unsupportedOperationsException
		System.out.println(names);

		Map<String, String> map = Map.ofEntries (
				new AbstractMap.SimpleEntry<>("1","deneme"),
				new AbstractMap.SimpleEntry<>("2","deneme2"));
		System.out.println(map);
		Set<String> set = Set.of("A", "B", "C");
		System.out.println(set);



			}

}

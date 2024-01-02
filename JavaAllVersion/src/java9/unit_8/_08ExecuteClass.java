package java9.unit_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _08ExecuteClass {

	public static void main(String[] args){
		List<Optional<String>> list = new ArrayList<>();
		list.add(Optional.of("Onur"));
		list.add(Optional.of("Dilan"));
		list.add(Optional.empty());

		List<String> collect = list.stream()
				.flatMap(v -> v.isPresent() ? Stream.of(v.get()) : Stream.empty())
								.collect(Collectors.toList());

		System.out.println(collect);

		List<String> withStream = list.stream().flatMap(Optional::stream).collect(Collectors.toList());
		System.out.println(withStream);


	}

}

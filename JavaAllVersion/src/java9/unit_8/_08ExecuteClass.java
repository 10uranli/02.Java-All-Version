package java9.unit_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _08ExecuteClass {

	public static void main(String[] args){

		System.out.println("**Stream**");
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

		System.out.println("**ifPresentOrElse**");

		Optional<String> value = Optional.of("Onur");
		value.ifPresentOrElse( x -> System.out.println("Present : " + x),()->System.out.println("Not Present"));

		Optional<Object> empty = Optional.empty();
		empty.ifPresentOrElse( x -> System.out.println("Present" + x),()->System.out.println("Not Present"));

		System.out.println("**or**");

		Optional<String> value1 = Optional.of("Onur");

		Supplier<Optional<String>> empty1 = () -> Optional.of("Not Present");

		value1 = value1.or(empty1);

		value1.ifPresent( x -> System.out.println("Value: " + x));

		value1 = Optional.empty();

		value1 = value1.or( empty1);

		value1.ifPresent( x -> System.out.println("Value: " + x));
	}

}

package java8.unit_3;

import lombok.*;

@Data /*getter-setter auto*/
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {
	private String name;
	private String surname;
	private int age;
}

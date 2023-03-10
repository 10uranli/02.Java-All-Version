package unit_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.poi.hssf.record.formula.functions.T;

public class Example {

	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(new Person("Dilek", "C", 45),new Person("Onur", "A", 23),new Person("?mer", "B", 52));
	
		Collections.sort(personList, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getSurname().compareTo(o2.getSurname());
			}
		});
		
	System.out.println("*************soy ada g?re s?ral? liste****************");
	for (Person person : personList) {
		System.out.println(person);
	}
	
	System.out.println("***********lamda ile ****************");
	
	List<Person> personList2 = Arrays.asList(new Person("Dilek", "C", 45),new Person("Onur", "A", 23),new Person("?mer", "B", 52));
	//tek sat?r
	Collections.sort(personList2,(o1, o2) -> o1.getSurname().compareTo(o2.getSurname()));
	
	for (Person person : personList) {
		System.out.println(person);
	}
	
	
	
	

		
	}
}

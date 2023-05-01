package java8.unit_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class _03ExecuteClass {

    public static void main(String[] args) {


        List<Person> personList = Arrays.asList(new Person("Dilek", "C", 45), new Person("Onur", "A", 23), new Person("Ömer", "B", 52));
        System.out.println("*****Methodlarý referans olarak verebiliyoruz.******");
        personList.forEach(System.out :: println);

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getSurname().compareTo(o2.getSurname());
            }
        });

        System.out.println("*************soy ada göre sýralý liste****************");
        for (Person person : personList) {
            System.out.println(person);
        }

        System.out.println("***********lamda ile ****************");

        List<Person> personList2 = Arrays.asList(new Person("Dilek", "C", 45), new Person("Onur", "A", 23), new Person("Ömer", "B", 52));
        //tek satýr
        Collections.sort(personList2, (o1, o2) -> o1.getSurname().compareTo(o2.getSurname()));
        personList2.forEach(System.out :: println);


    }
}

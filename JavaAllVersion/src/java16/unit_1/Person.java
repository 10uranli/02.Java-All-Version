package java16.unit_1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
abstract sealed class Person permits Customer , Employee {
     String name;
     int age;

     abstract String getInfo();
}

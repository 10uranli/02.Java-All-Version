package java16.unit_1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public final class Employee extends Person {
    int id;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age ;

    }

    @Override
    String getInfo() {
        return "Ben bir calisanim.Benim adim " + name + ", yasim " + age;
    }
}

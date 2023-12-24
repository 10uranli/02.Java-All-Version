package java16.unit_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public non-sealed class Customer extends Person {

    public Customer(String name, int age) {
        this.name = name;
        this.age = age ;
    }

    @Override
    String getInfo() {
        return "Ben bir musteriyim.Benim adim " + name + ", yasim " + age;
    }
}

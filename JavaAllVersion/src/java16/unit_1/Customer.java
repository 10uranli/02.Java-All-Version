package java16.unit_1;

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

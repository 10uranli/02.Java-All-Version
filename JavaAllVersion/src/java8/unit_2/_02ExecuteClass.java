package java8.unit_2;

public class _02ExecuteClass {

    public static void main(String[] args) {

        System.out.println("a - b parametresine sahip methodu tutar.");
        Math add = (a, b) -> (a + b); /*a - b parametresine sahip methodu tutar.*/
        System.out.println(add.operation(1, 2));

        System.out.println("a - b parametresine sahip methodu tutar.");
        Math sub = (a, b) -> (a - b); /*a - b parametresine sahip methodu tutar.*/
        System.out.println(sub.operation(1, 2));


        System.out.println("********Eski Yontem ile*********");
        MathFactory mathFactory = new MathFactory();
        System.out.println(mathFactory.operation(1,2));


        System.out.println("********Yeni Yontem ile Diger Operasyonlar*********");

        Talk sayHello = (a) -> System.out.println(a);
        sayHello.sayHi("Hello Lambda");

    }

    public interface Math {
        public int operation(int a, int b);
    }
    static class MathFactory implements Math{

        @Override
        public int operation(int a, int b) {
            return a+b;
        }
    }

    public interface Talk{
        public void sayHi(String a);
    }
}

package java8.unit_3;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class _03ExecuteClass_FunctionalInterface {


    /*
     * FProg. tek bir interface ile t�m ayn� parametreli i�lemleri y�netebilmemizi sa�l�yor.
     * Bu interface fonksiyonel bir i�lev g�rd��� i�in functional interface denmekte.
     * Bilinmesi gereken ilk kural tek abstract method i�ermelidir.
     * @FunctionalInterface ile belirtilir ve kurallar�na aksi durumda interface hata verir.
     * Peki tek method ile herkesin ula�abilece�i ve lambda i�lem yapan bir fonksiyonel interface biz neden yaratal�m?
     * Bu iste�e ba�l� olmakla birlikte java da haz�r interfacelerde kullan�labilir yani k�saca obje interface olmadan fonksiyonel kodlar yazabiliriz.
     * */

    public static void main(String[] args) {

        System.out.println("BiConsumer : arguments: 2 input , return : no results");
        BiConsumer<String, String> sayHi = (a, b) -> System.out.println(a + b);
        sayHi.accept("Hello", " World");

        System.out.println("BiFunction : arguments: 2 input , return : 1 ");
        //Not: Math icin �zel bir funtional interface gerek kalmadi.
        BiFunction<Integer, Integer, Integer> add = (a, b) -> (a + b);
        BiFunction<Integer, Integer, Integer> sub = (a, b) -> (a - b);
        System.out.println(add.apply(5, 7));
        System.out.println(sub.apply(5, 7));


        System.out.println("Predicate : arguments: 1 input , return : boolean");

        System.out.println("*****String*****");
        List<String> iller = Arrays.asList("Adana", "Ankara", "A�r�", "Kars", "Sivas");
        Predicate<String> startWith = (s) -> s.startsWith("A");
        Predicate<String> endWith = (s) -> s.endsWith("s");
        for (String il : iller
        ) {
            if (startWith.test(il))
                System.out.println(il);
            if (endWith.test(il))
                System.out.println(il);
        }
        //Bu sekilde Biraz anlams�z, sonucta predicate ortak, anlam katalim.

        System.out.println("***startWith***");
        controlWithPredicateWithString(iller, startWith);

        System.out.println("\n" + "***endWith***");
        controlWithPredicateWithString(iller, endWith);


        System.out.println("\n" + "*****Integer*****");
        List<Integer> nums = Arrays.asList(1, 5, 15, 20, 25);
        Predicate<Integer> evenNums = (i) -> i % 2 == 0;
        Predicate<Integer> greater10 = (i) -> i > 10 ;
        System.out.println("***evenNums***");
        controlWithPredicateWithInteger(nums, evenNums);
        System.out.println("\n" + "***greater10***");
        controlWithPredicateWithInteger(nums, greater10);


        System.out.println("DoubleConsumer : arguments: 1 double input , return : no");


    }

    public static void controlWithPredicateWithString(List<String> list, Predicate<String> predicate) {
        for (String s :
                list) {
            if (predicate.test(s)) {
                System.out.print(s + " ");
            }
        }
    }

    public static void controlWithPredicateWithInteger(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer i :
                list) {
            if (predicate.test(i)) {
                System.out.print(i + " ");
            }
        }
    }

}

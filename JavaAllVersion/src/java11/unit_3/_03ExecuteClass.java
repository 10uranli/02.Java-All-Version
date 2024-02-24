package java11.unit_3;

import java.util.Optional;
import java.util.stream.Stream;

public class _03ExecuteClass {

    public static void main(String[] args) {


        String name = "Onur";
        testing_method("repeat", name.repeat(5));

        String name1 = " Onur ";
        testing_method("strip", name1.strip() + "1");
        testing_method("strip leading", name1.stripLeading() + "1");
        testing_method("strip trailing", name1.stripTrailing() + "1");


        String name2 = " ";
        String name3 = "";

        System.out.println(name.isBlank());  //false
        System.out.println(name1.isBlank()); //false
        System.out.println(name2.isBlank()); //true
        System.out.println(name3.isBlank()); //true

        String multiText = "This\nis\nSpartaaa";
        multiText.lines().forEach(System.out :: println);
    }

    private static void testing_method(String whichMethod, String method){
        System.out.println(whichMethod + " ilgili String Api testi basladi");
        System.out.println(method);
        System.out.println(whichMethod + " ilgili String Api testi bitti");

    }
}


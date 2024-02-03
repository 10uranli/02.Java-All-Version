package java10.unit_2;

import java.util.Arrays;
import java.util.List;

public class _02ExecuteClass {


    public static void main(String[] args) {

       var name = "Onur";
       System.out.println(name + " class " + name.getClass());//Onur class class java.lang.String

        var count = 5;//primitive
        System.out.println(count);

        var list = Arrays.asList("Onur", "Anli");
        list.forEach(System.out ::println);


    }
}

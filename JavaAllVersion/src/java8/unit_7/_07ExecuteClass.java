package java8.unit_7;

import java.util.Optional;

public class _07ExecuteClass {

    public static void main(String[] args) {

        Integer nullInteger = null;
        Integer notNullInteger = 9;

        Optional<Integer> nullIntegerOptional = Optional.ofNullable(nullInteger);
        Optional<Integer> notNullIntegerOptional = Optional.ofNullable(notNullInteger);

        //false-true
        System.out.println(nullIntegerOptional.isPresent() + " " + notNullIntegerOptional.isPresent());

        String i = nullIntegerOptional.toString(); //Optional.empty

        //cevap: 9 orElse ile varsa degeri yoksa 0 döner. 
        System.out.println(nullIntegerOptional.orElse(0) + notNullIntegerOptional.orElse(0));


        notNullIntegerOptional.ifPresent(System.out :: print);

    }
}

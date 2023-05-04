package java8.unit_999.Example;


import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Execute_Example {
    static UtilObjects  util = new UtilObjects();
    public static void main(String[] args) {

        /******1******/
        Integer Euro = 21;
        System.out.println("Arabaları iceren bir listede en yüksek degerli aracı bulup, " +
                "kur farkı ile degeri çarpıp, 12 aylık ödemede aylık ödemeyi getiren örnek kod.");
        Optional<Integer> aylikTLTutar = util.getCarsList().stream().map(car -> car.getPrice()).max((o1, o2) -> o1.compareTo(o2)).map(price -> (price * Euro)/12);


        System.out.println(aylikTLTutar);
        //Collections.sort(personList2, (o1, o2) -> o1.getSurname().compareTo(o2.getSurname()));

        /******2******/
        List<Integer> integerList = util.getIntegerList();

        //10 ile çarpıp, ilk degeri alıp, optional degerin valuesunu getiren operasyon.
        System.out.println(integerList.stream().map(e -> e*10).findFirst().get());


        /*****3*****/
        System.out.println( integerList.stream().allMatch(e -> e.equals(3))); //false, butun datalar kontrolu\ hepsi saglarsa/
        System.out.println( integerList.stream().anyMatch(e -> e.equals(3))); //true, bir tanesi saglarsa true


    }


}

package java10.unit_3;


import java.util.List;
import java.util.stream.Collectors;

public class _03ExecuteClass {


    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6);
        tryCopyOf(intList); //java.lang.UnsupportedOperationException
        tryUnmodifiableList(intList);//java.lang.UnsupportedOperationException
        tryOrElseThrow(intList);// sirasiyla 2 ------ java.util.NoSuchElementException: No value present
    }

    private static void tryCopyOf(List<Integer> intList) {
        try{
            List<Integer> unmodifiableList = List.copyOf(intList);
            unmodifiableList.add(7);
        }catch (Exception e){
            System.out.println(e);
        }

    }

    private static void tryUnmodifiableList(List<Integer> intList) {
        try{
            List<Integer> unmodifiableList = intList.stream().
                    filter(a -> a % 3 == 0).
                    collect(Collectors.toUnmodifiableList());
            unmodifiableList.add(10);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    private static void tryOrElseThrow(List<Integer> intList) {
        Integer  i = intList.stream().filter(a -> a.equals(2)).findFirst().orElseThrow();
        System.out.println(i);
        try{
        Integer i2 = intList.stream().filter(a -> a.equals(20)).findFirst().orElseThrow();
        //Integer i2 = intList.stream().filter(a -> a.equals(20)).findFirst().orElseThrow(() -> new RuntimeException("sallamasyon hata"))
        //Integer i2 = intList.stream().filter(a -> a.equals(20)).findFirst().orElseThrow((RuntimeException::new));
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

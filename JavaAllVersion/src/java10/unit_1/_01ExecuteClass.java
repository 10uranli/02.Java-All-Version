package java10.unit_1;

public class _01ExecuteClass {
    public static void main(String[] args) {
        Runtime.Version version = Runtime.version();
        System.out.printf(" major version: %s%n uyumsuzluk vs.: %s%n Minor version: %s%n acil release: %s%n",
                version.feature(),
                version.interim(),
                version.update(),
                version.patch());

        //getRuntime ile gc, freememory vs.
    }
}

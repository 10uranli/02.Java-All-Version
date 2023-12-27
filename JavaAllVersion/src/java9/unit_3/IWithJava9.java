package java9.unit_3;

public interface IWithJava9 {

    String CONSTANT_VARIABLE = "CONSTANT_VARIABLE";

    private void private_method(String message) {
        private_static_method();
        System.out.println("Message : " + message);
    }
    private static void private_static_method() {
        System.out.println("private_static_method");
    }
    default void default_method(String message) {
        private_method(message);
        System.out.println(message);
    }
}

package java8features.methodreferences;

/**
 * Example 1
 * In the following example, we have defined a functional interface and referring
 * a static method to it's functional method say().
 */
interface Sayable {
    void say();
}

public class MethodReference1 {

    public static void saySomething() {
        System.out.println("Hello This is a static method");
    }

    public static void main(String[] args) {
        // Referring static method
        Sayable sayable = MethodReference1::saySomething;
        // Calling interface method
        sayable.say();
    }
}

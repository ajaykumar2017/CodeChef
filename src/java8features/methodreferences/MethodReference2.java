package java8features.methodreferences;

/**
 * Example 2
 * In the following example,
 * we are using predefined functional interface Runnable to refer static method.
 */
public class MethodReference2 {
    public static void threadStatus() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        Thread t2 = new Thread(MethodReference2::threadStatus);
        t2.start();
    }
}

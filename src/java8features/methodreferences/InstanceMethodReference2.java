package java8features.methodreferences;

/**
 * In the following example, we are referring instance (non-static) method.
 * Runnable interface contains only one abstract method.
 * So, we can use it as functional interface
 */

public class InstanceMethodReference2 {
    public void printMsg() {
        System.out.println("This is a message!");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new InstanceMethodReference2()::printMsg);
        thread.start();
    }
}

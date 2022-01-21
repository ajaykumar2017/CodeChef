package java8features.methodreferences;

/** Example 1
 * In the following example, we are referring non-static methods.
 * You can refer methods by class object and anonymous object.
 */
interface Sayable2 {
    void say();
}
public class InstanceMethodReference {
    public void saySomething() {
        System.out.println("Hello, this is non-static method.");
    }

    public static void main(String[] args) {
        InstanceMethodReference methodReference = new InstanceMethodReference();
        // Referring non-static method using reference
        Sayable2 sayable = methodReference::saySomething;
        // Calling interface method
        sayable.say();

        // Referring non-static method using anonymous object
        Sayable2 sayable2 = new InstanceMethodReference()::saySomething;
        // Calling interface method
        sayable2.say();
    }
}

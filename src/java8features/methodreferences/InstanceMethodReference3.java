package java8features.methodreferences;

import java.util.function.BiFunction;

/**
 * In the following example, we are using BiFunction interface.
 * It is a predefined interface and contains a functional method apply().
 * Here, we are referring add method to apply method.
 */

class Arithmetic2 {
    public int add (int p1, int p2) {
        return p1 + p2;
    }
}
public class InstanceMethodReference3 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = new Arithmetic2()::add;
        int result = adder.apply(10, 30);
        System.out.println(result);
    }
}

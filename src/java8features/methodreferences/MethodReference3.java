package java8features.methodreferences;

import java.util.function.BiFunction;

/**
 * You can also use predefined functional interface to refer methods. In the following example,
 * we are using BiFunction interface and using it's apply() method.
 */
class Arithmetic {
    public static int add (int a, int b) {
        return a + b;
    }
}
public class MethodReference3 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
        int result = adder.apply(10, 20);
        System.out.println(result);
    }
}

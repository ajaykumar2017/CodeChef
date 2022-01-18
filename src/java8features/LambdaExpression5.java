package java8features;

interface Addable {
    int add(int p1, int p2);
}

public class LambdaExpression5 {
    public static void main(String[] args) {

        // Multiple parameters in lambda expression
        Addable add1 = (p1, p2) -> (p1 + p1);
        System.out.println(add1.add(10, 20));

        // Multiple parameters with data type in lambda expression
        Addable add2 = (int p1, int p2) -> {
            return (p1 + p2);
        };
        System.out.println(add2.add(20, 30));

        // Lambda expression with return keyword.
        Addable add3 = (int p1, int p2) -> (p1 + p2);
        System.out.println(add3.add(20, 30));

    }
}

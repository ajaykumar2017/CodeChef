package java8features.lambdaexpression;

interface Sayable {
    String say();
}

public class LambdaExpression3 {
    public static void main(String[] args) {
        Sayable s = () -> "I have to say nothing";

        System.out.println(s.say());
    }
}

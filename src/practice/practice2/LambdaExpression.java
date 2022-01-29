package practice.practice2;

interface SomeClass2 {
    void display();
}

public class LambdaExpression {
    public static void main(String[] args) {
        SomeClass2 someClass2 = () -> System.out.println("Hello from Main");
        someClass2.display();
    }
}
/**
 * O/p:
 * Hello from Main
 */
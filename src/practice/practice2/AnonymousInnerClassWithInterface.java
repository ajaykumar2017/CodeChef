package practice.practice2;

interface SomeClass1 {
    void display();
}

public class AnonymousInnerClassWithInterface {
    public static void main(String[] args) {
        SomeClass1 someClass1 = new SomeClass1() {
            public void display() {
                System.out.println("Display from display method of Ann in class");
            }
        };
        someClass1.display();
    }
}
/**
 * O/p:
 * Display from display method of Ann in class
 */
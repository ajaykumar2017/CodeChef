package practice.practice2;

class SomeClass {
    void display() {
        System.out.println("Display from display method of SomeClass");
    }
}

public class AnonymousClassAsClassExtension {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass() {
            void display() {
                System.out.println("Display from display method of Ann in class");
            }
        };
        someClass.display();
    }
}

/**
 * O/p:
 * Display from display method of Ann in class
 */
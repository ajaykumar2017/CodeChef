package practice.practice2;

class SuperClass1 {
    void m1() {
        System.out.println("From Superclass m1");
    }
    void m3() {
        System.out.println("From Superclass m3");
    }
}

class SubClass1 extends SuperClass1 {
    void m1() {
        System.out.println("From Subclass m1");
    }
    void m2() {
        System.out.println("From Subclass m3");
    }
}

public class Generalization {
    public static void main(String[] args) {
        SuperClass1 sup = new SubClass1();
        sup.m1();
        sup.m3();
    }
}
/**
 * O/p:
 * From Subclass m1
 * From Superclass m3
 */
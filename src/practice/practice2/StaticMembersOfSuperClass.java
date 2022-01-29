package practice.practice2;

class Parent {
    static int a;

    static void m1() {
        System.out.println("From Parent");
    }

    static {
        System.out.println("Static------From Parent");
    }
}

class Subclass extends Parent {
    static int b;

    static void m2() {
        System.out.println("From Subclass");
    }

    static {
        System.out.println("Subclass----From Parent");
    }
}

public class StaticMembersOfSuperClass {
    public static void main(String[] args) {
        Subclass.a = 12;
        Subclass.b = 10;
        Subclass.m1();
        Subclass.m2();
    }
}
/**
 * O/p:
 * Static------From Parent
 * Subclass----From Parent
 * From Parent
 * From Subclass
 */
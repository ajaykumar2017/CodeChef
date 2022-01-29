package practice.practice2;

class Class11 {
    interface InnerInterface1 {
        void m2();
    }
}

class S2 extends Class11 {
    static class S22 implements InnerInterface1 {
        public void m2() {
            System.out.println("Display from m2 of S22");
        }
    }

    S22 obj = new S22();

    void m1() {
        obj.m2();
    }
}

public class InnerInterfaceWithinTheClass {
    public static void main(String[] args) {
        S2 s1 = new S2();
        s1.m1();
    }
}
/**
 * O/p:
 * Display from m2 of S22
 */
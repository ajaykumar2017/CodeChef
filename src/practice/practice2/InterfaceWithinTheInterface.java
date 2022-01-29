package practice.practice2;

interface Interface2 {
    interface InnerInterface {
        void m2();
    }
}

class S1 implements Interface2 {
    static class S2 implements InnerInterface {
        public void m2() {
            System.out.println("Display from m2 of S2");
        }
    }
    S2 obj = new S2();
    void m1() {
        obj.m2();
    }
}
public class InterfaceWithinTheInterface {
    public static void main(String[] args) {
        S1 s1 = new S1();
        s1.m1();
    }
}

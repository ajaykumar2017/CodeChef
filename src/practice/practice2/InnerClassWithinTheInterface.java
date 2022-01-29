package practice.practice2;

interface Interface1 {
    class Class1 {
        void m2() {
            System.out.println("Dis from inner class");
        }
    }//end of inner class
}

class Class2 implements Interface1 {
    Class1 class1 = new Class1();

    void m1() {
        class1.m2();
    }
}

public class InnerClassWithinTheInterface {
    public static void main(String[] args) {
        Class2 class2 = new Class2();
        class2.m1();
    }
}
/**
 * O/p:
 * Dis from inner class
 */

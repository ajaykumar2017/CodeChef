package practice.practice2;

import static java.lang.System.out;

interface Interface {
    public static final int a = 10;
    public abstract void withdraw(int amount);
}

class Test implements Interface {
    public void withdraw(int amount) {
        out.println("Amount Withdrawn = " +amount);
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        out.println(Test.a);
        new Test().withdraw(1000);
    }
}

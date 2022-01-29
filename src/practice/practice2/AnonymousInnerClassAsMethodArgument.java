package practice.practice2;

interface AtmCard {
    void m();
}

class Bank {
    void dis(AtmCard x) {
        x.m();
    }
}

public class AnonymousInnerClassAsMethodArgument {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.dis(new AtmCard() {
            @Override
            public void m() {
                System.out.println("From Anonymous Inner Class");
            }
        });
    }
}
/**
 * O/p:
 * From Anonymous Inner Class
 */

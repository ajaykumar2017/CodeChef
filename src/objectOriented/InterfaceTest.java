package objectOriented;

interface Test{
    public static final int b=100;
    public abstract void withdraw(int amt);
}
class Rupees implements Test{
    public void withdraw(int amt){
        System.out.println("Amt withdrawn ="+amt);
        System.out.println("Transaction in Rupees");
    }
}
class Dollars implements Test{
    public void withdraw(int amt){
        System.out.println("Amt withdrawn =$"+(float)amt/72);
        System.out.println("Transaction in Dollars");
    }
}
public class InterfaceTest {
    public static void main(String args[])
    {
        System.out.println("The value of b="+Test.b);
        Rupees rupees=new Rupees();
        rupees.withdraw(1200);
        Dollars dollars=new Dollars();
        dollars.withdraw(23456);
    }
}

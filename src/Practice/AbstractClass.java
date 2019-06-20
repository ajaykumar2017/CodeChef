/*
* 1. The class which is declared using abstract keyword is abstract class.
* 2. Abstract class is a collection of abstract methods and concrete methods.
* Coding Rule:
* (i) The abstract method within the abstract class must be declared with abstract keyword
* (ii) We Can not create object for abstract classes.
 */
package Practice;
import java.util.*;
abstract class Arithmetic{
    double z;
    abstract void calculate(int x);
    void dis()
    {
        System.out.println("The sqrt="+z);
    }
}
class Result extends Arithmetic{
    void calculate(int x){
        z=Math.sqrt(x);
    }
}
public class AbstractClass {
    public static void main(String args[]){
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the value of x");
       int x=s.nextInt();
       Result r=new Result();
       r.calculate(x);
       r.dis();
    }
}

package practice;
import java.util.*;
class Subclass11{   //Outer class
    int a;
    static int b;
    static class Subclass22   //Inner class
    {
        void m2(Subclass11 x){   //ref var
            System.out.println("The val a="+x.a);
            System.out.println("The val a="+b);
        }
    }  //end of inner class
    Subclass22 obj2=new Subclass22();
    void m1(Subclass11 x){
        obj2.m2(x);
    }
}  //end of outer class
public class StaticmemberInnerClass {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Subclass11 obj1=new Subclass11();
        System.out.println("Enter the value of a");
        obj1.a=s.nextInt();
        System.out.println("Enter the value of b");
        Subclass11.b=s.nextInt();
        obj1.m1(obj1);
        s.close();

    }
}

package objectOriented;
import static java.lang.System.*;
class SuperClass1
{
    void m1()
    {
        out.println("superclass displayed from m1");
    }
    void m3()
    {
        out.println("Superclass displayed from m3");
    }
}
class SubClass1 extends SuperClass1
{
    void m1()
    {
        out.println("Subclass displayed from m1");
    }
    void m2()
    {
        out.println("Subclass displayed from m2");
    }
}
public class Generalization {
    public static void main(String[] args){
        SuperClass1 obj;
        obj=new SubClass1();
        //Generalization
        obj.m1();
        //obj.m2();        this will generate error
        obj.m3();
    }
}

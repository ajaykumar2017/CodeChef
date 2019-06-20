//Instance Member Inner Class
package practice;
class Subclass1{   //outer class
    int a=100;
    class Subclass2{
        int b=200;
        void m2(){
            System.out.println("Outer class vlaue: "+a);
            System.out.println("Innner class vlaue: "+b);
        }
    }  //end of inner class
    Subclass2 obj2=new Subclass2();
    void m1(){
        obj2.m2();
    }
} //End of inner class
public class InnerClass {
    public static void main(String[] args){
        Subclass1 obj1=new Subclass1();
        obj1.m1();
    }
}

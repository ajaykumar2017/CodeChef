//1. Anonymous Inner class as Class extension
package practice;
class Superclass{
    void m(){
        System.out.println("Superclass dis from m()");
    }
}
public class AnonymousInnerClass1 {
    public static void main(String[] args){
        Superclass obj=new Superclass(){
            void m(){
                System.out.println("Subclass display from m1");
            }
        };
        obj.m();
    }
}

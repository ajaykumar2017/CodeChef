//2. Anonymous Inner class withInterface
package practice;
interface Test1{
    public void m();
}
public class AnonymousInnerclass2 {
    public static void main(String[] args){
        Test1 obj=new Test1(){
            public void m(){
                System.out.println("Subclass dis from m1");
            }
        };
        obj.m();
    }
}

//4. Anonymous inner class within interface
package practice;
interface Interface{
    class C2{
        void m2(){
            System.out.println("Display from innerclass");
        }
    }  //end of inner class
}
class C1 implements Interface {
    C2 obj2=new C2();
    void m1(){
        obj2.m2();
    }
}
public class AnonymousInnerClass4 {
    public static void main(String[] args){
        C1 obj1=new C1();
        obj1.m1();
    }
}

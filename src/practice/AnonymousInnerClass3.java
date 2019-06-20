//3. Anonymous Inner class as method argument
package practice;
interface AtmCard{
    public void m();
}
class Bank{
    void dis(AtmCard x){
        x.m();
    }
}
public class AnonymousInnerClass3 {
    public static void main(String[] args){
        AtmCard obj=new AtmCard() {
            @Override
            public void m() {
               System.out.println("Display from main1");
            }
        };
        obj.m();
        Bank obj1=new Bank();
        obj1.dis(new AtmCard() {
            @Override
            public void m() {
                System.out.println("Display from main2");
            }
        });
    }
}

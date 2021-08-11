package objectoriented;
import static java.lang.System.*;
interface I1{
    int a=10;
    public void add();
}
interface I2{
    int b=20;
    public void add();
}
class Result1 implements I1,I2{
    public void add(){
        int c=I1.a+I2.b;
        out.println("The sum="+c);
    }
}
public class MultipleInheritence {
    public static void main(String[] args){
        Result1 obj=new Result1();
        obj.add();
    }
}

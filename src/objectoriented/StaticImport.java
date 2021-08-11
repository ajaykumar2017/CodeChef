package objectoriented;
import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.System.*;

public class StaticImport {
    public static void main(String[] args){
        Scanner s=new Scanner(in);
        out.println("Enter the value of x");
        int x=s.nextInt();
        double k=sqrt(x);
        double z=pow(x,3);
        out.println("sqrt of"+x+"="+k);
        out.println("cube of "+x+"="+z);
        s.close();

    }

}

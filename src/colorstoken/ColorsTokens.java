package colorstoken;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//party
public class ColorsTokens {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=s.nextInt();
            Integer[] cost=new Integer[n];
            for(int j=0;j<n;j++)
            {
                cost[j]=s.nextInt();
            }
//            Arrays.sort(new int[][]{cost}, reverseOrder());
            Arrays.sort(cost, Collections.reverseOrder());
            int low=0;
            int high;
            if (cost.length>4)
            {
                high=4;
            }else{
                high=cost.length;
            }
            int total=0;
            boolean st=true;
            while (st)
            {
                for(int k=low;k<high-2;k++)
                {
                    total=total+cost[k];
                }

                low=high;
                if (cost.length-high>4)
                {
                    high=high+4;
                }else{
                    high=cost.length;
                    st=false;
                }
            }
            System.out.println(total);

        }
    }
}

import java.util.*;
import java.lang.*;
public class MaximiseSum {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        s.nextLine();
        int[] N=new int[T];
        Integer[] A= new Integer[0];
        for (int i=0;i<T;i++){
            N[i]=s.nextInt();
            for(int j=0;j<N[i];j++){
                A[i]=s.nextInt();
            }
        }
        List<Integer> l = Arrays.asList(A);
        int min=0;
        for (int k=0;k<T;k++)
        {
            for (int i=0;i<N[k];i++)
            {
                Collections.shuffle(l);
                min=Math.abs(l.get(0)-l.get(1))+Math.abs(l.get(2)-l.get(3));
                for (int j=1;j<N[k];j++)
                {
                    Collections.shuffle(l);
                    int min1=Math.abs(l.get(0)-l.get(1))+Math.abs(l.get(2)-l.get(3));
                    if (min<min1)
                        min=min1;
                }
            }
        }
        System.out.println(min);
        
    }
}

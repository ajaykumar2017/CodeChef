package hackerrank;

import java.util.*;

import static java.lang.Integer.parseInt;

public class QueriesProblemJuneCircuit {
    public static void main(String[] args) throws Exception{
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int Q=s.nextInt();
        s.nextLine();
        int[] arr=new int[N];
        for (int i=0;i<N;i++){
            arr[i]=s.nextInt();
        }
        for (int i=0;i<Q;i++){
            String que2=s.nextLine();
            String[] que=que2.split(" ");
            try{
                if (Integer.parseInt(que[0])==1){
                    arr[Integer.parseInt(que[1])]=arr[Integer.parseInt(que[1])]*Integer.parseInt(que[2]);
                }
                else{
                    int[] min=new int[arr.length];
                    for(int k=0;k<arr.length;k++){
                        int a=0,b=0;
                        for(int l=0;l<k;l++){
                            a+=arr[l];
                        }
                        for (int m=k+1;m<arr.length;m++){
                            b+=arr[m];
                        }
                        min[i]=Math.abs(a-b);
                    }
                    int mm=0;
                    int index=0;
                    for (int p=0;p<min.length;p++){
//                        if (min[p]<mm){
//                            mm=min[p];
//                            index=p;
//                        }
                        System.out.println(min[p]);
                    }
                    System.out.println(index);
                }
            }catch (Exception e){

            }
        }
    }
}

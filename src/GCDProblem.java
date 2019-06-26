/*
For each set of four integers given  where . You are required to compute
the following:


Input format

First line:  that denotes the number of test cases
Next  lines: A integer
Output format

Print the answer for each test case  in a new line.

Constraints

SAMPLE INPUT
2
4
5
SAMPLE OUTPUT
1
5
Explanation
For First Test case N=4 :
(1,2,3,4) :   gcd(1,2,3,4)4 = 1
Total sum = 1

For Second Test Case N=5 :
(1,2,3,4) :   gcd(1,2,3,4)4 = 1
(1,2,3,5) :   gcd(1,2,3,5)4 = 1
(1,2,4,5) :   gcd(1,2,4,5)4 = 1
(1,3,4,5) :   gcd(1,3,4,5)4 = 1
(2,3,4,5) :   gcd(2,3,4,5)4 = 1
Total sum = 1+1+1+1+1 = 5
 */
import java.util.*;
public class GCDProblem {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int T=s.nextInt();
        for(int i=0;i<T;i++){
            int N=s.nextInt();
            int[] arr=new int[N];
            int sum=0;
            for (int j=0;j<N;j++){
                arr[j]=j+1;
            }
            if (N<=4){
                sum=sum+(int)Math.pow(findGCD(arr,N),4);
            }else{
                int a=N-4;
                for(int p=0;p<N;p++){
                    int[] temp=new int[N];
                    temp=deleteSpefInt(arr,p);
                    for(int q=p+1;q<p+a;q++){
                        temp=deleteSpefInt(arr,q);
                    }
                    sum=sum+(int)Math.pow(findGCD(temp, temp.length),4);

                }
//                for (int p=0;p<N;p++){
//                    sum=sum+(int)Math.pow(findGCD(deleteSpefInt(arr,p),deleteSpefInt(arr,p).length),4);
//                }
            }
            System.out.println(sum);
        }}
    public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    public static int findGCD(int arr[], int n)
    {
        int result = arr[0];
        for (int i = 1; i < n; i++)
            result = gcd(arr[i], result);
        return result;
    }
    public static int[] deleteSpefInt(int[] arr,int index){
        int n=arr.length;
        for(int i=index;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        return arr;
    }
}

package hackerrank;

import java.util.*;
import java.lang.*;
/*
*#include <bits/stdc++.h>
using namespace std;
long long int A[1000010],z;
int main(){
    int T,N,i;
    cin >> T;
    while(T--){
        cin >> N;
        i=N;
        while(i--) cin >> A[i];
        sort(A,A+N);
        z=0;
        for(i=0;i<N;i++) z+=abs(A[N/2]-A[i]);
        cout << z << endl;
    }
}
*
*
 */
public class MaximiseSum {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        s.nextLine();
        int N;
        for (int i=0;i<T;i++){
            N=s.nextInt();
            s.nextLine();
            int[] A= new int[N];
            for(int j=0;j<N;j++){
                A[j]=s.nextInt();
            }
            Arrays.sort(A);
            int z=0;
            for(int k=0;k<N;k++)
                z+=Math.abs(A[N/2]-A[k]);
            System.out.println(z);

        }
        
    }
}

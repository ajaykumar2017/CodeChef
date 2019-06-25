/*
 * There are two queries
 * input
 * -----
 * First line contains n(number of the elements in the array and q is the number of
 * queries)
 * From second line the queries are given as input.
 * -------
 * There are two types of queries:
 * 1 j x: update a[j]=x
 * 2 y: Find the spectral number pow((c[p]+1),(c[p]+1)) here c[p] is the
 *      number of occurences of the unique p elements in the sub-array.
 * -------------------------------------------------------------------
 * sample input:
 * 5 5
 * 1 2 3
 * 2 3
 * 2 2
 * 1 4 5
 * 2 4
 * -------
 * sample output:
 * 108
 * 27
 * 108
 * ------------
 * Description:
 * array is initially {0,0,0,0,0}
 * for query 1: array becomes {0,0,3,0,0}
 * for query 2: value=((2+1)^(2+1))*((1+1)^(1+1))=108    0 is 2 times and 1 is 1 time
 * for query 3: array becomes={0,0,0,0,5}
 * for query 4: value=((3+1)^(3+1))*((1+1)^(1+1))=108   0 is three times and 1 is 1 time
 * */

import java.math.BigInteger;
import java.util.*;

public class SpectralNumber2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int q = s.nextInt();
        s.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < q; i++) {
            String str = s.nextLine();
            String[] str1 = str.split(" ");
            if (str1[0].equals("1")) {
                arr[Integer.parseInt(str1[1])] = Integer.parseInt(str1[2]);
            }
            if (str1[0].equals("2")) {
                int m = Integer.parseInt(str1[1]);
                BigInteger res = new BigInteger("1");
                for (int j = 0; j < m; j++) {
                    int count = 0;
                    String sc = "";
                    for (int p = 0; p < m; p++) {
                        if (!sc.contains(String.valueOf(arr[p])))
                            count++;
                        sc = sc + String.valueOf(arr[p]);
                    }
                    res = res.multiply(BigInteger.valueOf(count + 1).pow(count + 1));
                }
                System.out.println(res);
            }

        }
    }
}

package interviewquestions;/*
* Given 2 strings s1 and s2, write a program to merge the two strings and print all
* possible strings, in which the order of individual strings is preserved.
* (Assume all charcters in both the strings are different)
*
* Example:
* input: S1="AB", S2="CF"
* Output:
*   ABCF
*   ACBF
*   ACFB
*   CABF
*   CAFB
*   CFAB
* */
import java.util.*;
public class AmazonInterviewQuestion {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        s.nextLine();
        String s2=s.next();
        printIls(s1,s2,s1.length(),s2.length());
    }

    private static void printIls(String s1, String s2, int m, int n) {
        char[] iStr=new char[m+n];
        printIlsRecur(s1,s2,iStr,m,n,0);
    }

    private static void printIlsRecur(String s1, String s2, char[] iStr, int m, int n, int i) {
        if (m==0&&n==0)
            System.out.println(String.valueOf(iStr));
        if (m!=0){
            iStr[i]=s1.charAt(0);
            printIlsRecur(s1.substring(1), s2, iStr, m-1, n, i+1);
        }
        if (n!=0){
            iStr[i] = s2.charAt(0);
            printIlsRecur(s1, s2.substring(1), iStr, m, n-1, i+1);
        }

    }
}

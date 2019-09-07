package practice;

import java.util.*;

public class StringTokenizer {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str= sc.nextLine();
        System.out.println("Enter the delimiter");
        String ch=sc.next();
        java.util.StringTokenizer st=new java.util.StringTokenizer(str,ch);
        System.out.println("---Dis Tokens---");
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
        sc.close();
    }
}

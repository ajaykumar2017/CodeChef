package hackerrank;/*
* Google Placement Question:
* Find the minimum number of Characters to be inserted to convert a given string to palindrome.
* Example:
* Input: aa
* output: Number of insertions required is 0
* (i.e.aa)
* Input: abcd
* Output: Number of insertiond required is 3
* (i.e. dcbabcd)
* */
import java.util.*;
public class CharToPalindrome {
    public static void main(String[] args){
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
          checkPalindrome(str);

    }
    private static void checkPalindrome(String str){
        if (str.equals(stringReverse(str)))
            System.out.println("It is already Palindrome, no need to add some character");
        else{
            int count=0;
            String strRev=stringReverse(str);
            for(int i=0;i<strRev.length()/2;i++){
                if (strRev.charAt(i)!=strRev.charAt(strRev.length()-1-i))
                    count++;
            }
            System.out.println("The number of characters needed to be this string" +
                    " palindrome is : "+count);

        }
    }
    private static String stringReverse(String s){
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        return s1;
    }
}

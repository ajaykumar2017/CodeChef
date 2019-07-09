package practice;

import java.util.Scanner;

public class StringBuilderClass {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        StringBuilder str= new StringBuilder(sc.nextLine());
        StringBuilder str1=str.reverse();
        if (str.equals(str1)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }

    }
}

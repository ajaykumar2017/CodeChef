package interviewquestions;

import java.util.Scanner;

public class MicroSoftInterviewQuestion1 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        char[] str=str1.toCharArray();
        int len=str1.length();
        int i=0;
        while(i<len){
            int count=0;
            char ch=str1.charAt(i);
            for(int j=i+1;j<len;j++){
                if(ch==str1.charAt(j)){
                    count++;
                    str[j]='*';
                }
            }
                i=i+count;
                i++;
        }
        String temp=String.valueOf(str);
        System.out.println(temp.replace('*',' '));
    }
}

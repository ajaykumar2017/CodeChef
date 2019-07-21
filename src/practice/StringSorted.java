package practice;
import java.util.*;
public class StringSorted {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter set of 10 strings:");
        String[] strArray=new String[10];
        for (int i=0;i<10;i++)
        {
            strArray[i]=scanner.nextLine();
        }

        Arrays.sort(strArray);
        int stringArrayLength=strArray.length;
        for(int i=0;i<stringArrayLength;i++)
        {
            char[] charArray=strArray[i].toCharArray();
            Arrays.sort(charArray);
            strArray[i]=new String(charArray);
        }
        System.out.println("Original set of strings and the strings in alphabetically sorted order is:");
        System.out.println(Arrays.toString(strArray));
    }
}

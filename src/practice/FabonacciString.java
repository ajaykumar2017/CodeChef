package practice;
import java.util.*;
public class FabonacciString {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        s.nextLine();
        for(int i=0;i<t;i++)
        {
            String str1=s.nextLine();
            char[] ch=str1.toCharArray();
            Arrays.sort(ch);
            String str=new String(ch);
//            System.out.println(countUniqueCharacters(str));
//            countNoOfeachCharacters(str);
            String unqChar=findUniqueString(str);
//            System.out.println(str+" "+str.length());
//            System.out.println(unqChar+" "+unqChar.length());
            if (unqChar.length()<3)
            {
                System.out.println("Dynamic");
            }else{
                int flag=0;
                for (int j=2;j<unqChar.length();j++){
                    try{
                        if (frequency(unqChar.charAt(j-2),str)==
                                (frequency(unqChar.charAt(j-1),str)+frequency(unqChar.charAt(j),str))){
                            flag=1;
                            break;
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
                if (flag==1){
                    System.out.println("Dynamic");
                }else{
                    System.out.println("Not");
                }
            }

        }
    }
    public static int frequency(char ch, String str){
        int frequency = 0;
        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                ++frequency;
            }
        }
        return frequency;
    }
    public static int countUniqueCharacters(String input) {
        boolean[] isItThere = new boolean[Character.MAX_VALUE];
        for (int i = 0; i < input.length(); i++) {
            isItThere[input.charAt(i)] = true;
        }

        int count = 0;
        for (int i = 0; i < isItThere.length; i++) {
            if (isItThere[i] == true){
                count++;
            }
        }

        return count;
    }
    public static void countNoOfeachCharacters(String str){
        char string[] = str.toCharArray();
        int[] freq=new int[string.length];
        for(int i = 0; i <str.length(); i++) {
            freq[i] = 1;
            for(int j = i+1; j <str.length(); j++) {
                if(string[i] == string[j]) {
                    freq[i]++;

                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
        }

        //Displays the each character and their corresponding frequency
        System.out.println("Characters and their corresponding frequencies");
        for(int i = 0; i <freq.length; i++) {
            if(string[i] != ' ' && string[i] != '0')
                System.out.println(string[i] + "-" + freq[i]);
        }
    }
    public static String findUniqueString(String str){
        char string[] = str.toCharArray();
        int[] freq=new int[string.length];
        for(int i = 0; i <str.length(); i++) {
            freq[i] = 1;
            for(int j = i+1; j <str.length(); j++) {
                if(string[i] == string[j]) {
                    freq[i]++;

                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
        }//Displays the each character and their corresponding frequency
        String us="";
        for(int i = 0; i <freq.length; i++) {
            if(string[i] != ' ' && string[i] != '0')
                us=us+string[i];
        }
        return us;
    }
}

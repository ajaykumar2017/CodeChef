package hackerrank;/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
*/
import java.util.*;
class RotationString {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        */
        //Scanner
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        s.nextLine();
        String s1=s.next();
        s.nextLine();
        String s2=s.next();
        int operation=0;
        int i=0;
        String temp="";
        while(!((s1+revString(temp)).equals(s2))){
                s1=charRemoveAt(s1,0);
                temp=temp+s2.charAt(N-1-i);
                operation++;
                i++;
        }
        System.out.println(operation);}
    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }
    public static String revString(String str){
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
}

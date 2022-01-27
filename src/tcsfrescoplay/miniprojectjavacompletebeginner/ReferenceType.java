package tcsfrescoplay.miniprojectjavacompletebeginner;


import java.util.ArrayList;
import java.util.Scanner;

// All test cases passed
class CipherDecipher {
    /**
     * This method is used to cipher the message (normal) by following steps.
     * Swap the cases of String - UpperCase letters to LowerCase letters and viceversa.
     * Reverse the String
     * Replace the spaces of string with a star character("*")
     * Replace the characters in the even positions of the string
     * Append any integer at the last in that String
     *
     * @param normal
     * @return the ciphered message
     */
    public String ciphering(String normal) {
        String result = null;

        // Step 1 : Swap the cases of String - UpperCase letters to LowerCase letters and viceversa.
        StringBuilder newStr = new StringBuilder(normal);
        for (int i = 0; i < normal.length(); i++) {
            //Checks for lower case character
            if (Character.isLowerCase(normal.charAt(i))) {
                //Convert it into upper case using toUpperCase() function
                newStr.setCharAt(i, Character.toUpperCase(normal.charAt(i)));
            }
            //Checks for upper case character
            else if (Character.isUpperCase(normal.charAt(i))) {
                //Convert it into upper case using toLowerCase() function
                newStr.setCharAt(i, Character.toLowerCase(normal.charAt(i)));
            }
        }

        // Step 2 : Reverse the String
        newStr.reverse();

        // Step 3 : Replace the spaces of string with a star character("*")
        result = newStr.toString().replace(' ', '*');

        //Step 4 : Replace the characters in the even positions of the string with their corresponding ascii value
        ArrayList<Character> newArr = new ArrayList<>();
        for (int i = 0; i < result.length(); i++) {
            if ((i + 1) % 2 == 0) {
                String ascii = String.valueOf((int) result.charAt(i));
                for (int j = 0; j < ascii.length(); j++) {
                    newArr.add(ascii.charAt(j));
                }
            } else {
                newArr.add(result.charAt(i));
            }
        }
        // Step 5 : Add An Integer 3 at the last
        newArr.add('3');

        StringBuilder newStr1 = new StringBuilder();
        for (Character character : newArr) {
            newStr1.append(character);
        }
        return newStr1.toString();
    }

    /**
     * This method is used to get the normal text by the reverse process of ciphering.
     *
     * @param ciphered
     * @return the deciphered message
     */
    public String deciphering(String ciphered) {
        // Step 1: Removing the Integer at the last
        String result = null;
        StringBuilder str1 = new StringBuilder(ciphered);
        str1.deleteCharAt(ciphered.length() - 1);

        //Step 2 : Replace the corresponding ascii value with their characters
        ArrayList<Character> newArr = new ArrayList<>();
        for (int i = 0; i < str1.length(); ) {
            String temp = "";
            int j, count = 0;
            for (j = i; j < str1.length(); j++) {
                if (Character.isDigit(str1.charAt(j))) {
                    temp += str1.charAt(j);
                    count++;
                } else {
                    break;
                }
            }
            if (count > 0) {
                newArr.add((char) Integer.parseInt(temp));
                i += count;
            } else {
                newArr.add(str1.charAt(i));
                i++;
            }
        }

        // Step 3 & 4 : Replace the spaces of string with a star character("*")
        StringBuilder newStr = new StringBuilder();
        for (Character character : newArr) {
            newStr.append(character);
        }
        result = newStr.reverse().toString().replace('*', ' ');

        // Step 5 :
        StringBuilder newStr1 = new StringBuilder(result);
        for (int i = 0; i < result.length(); i++) {
            //Checks for lower case character
            if (Character.isLowerCase(result.charAt(i))) {
                //Convert it into upper case using toUpperCase() function
                newStr1.setCharAt(i, Character.toUpperCase(result.charAt(i)));
            }
            //Checks for upper case character
            else if (Character.isUpperCase(result.charAt(i))) {
                //Convert it into upper case using toLowerCase() function
                newStr1.setCharAt(i, Character.toLowerCase(result.charAt(i)));
            }
        }

        return newStr1.toString();
    }
}

public class ReferenceType {

    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        String normal = readInput.nextLine();
        String ciphered = readInput.nextLine();
        CipherDecipher cipherOrDecipher = new CipherDecipher();
        System.out.println(cipherOrDecipher.ciphering(normal));
        System.out.println(cipherOrDecipher.deciphering(ciphered));
    }

}

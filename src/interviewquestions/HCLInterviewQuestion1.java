package interviewquestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Java Program to Find the Occurrence of Words in a String using HashMap
 */
public class HCLInterviewQuestion1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String result = countingMap(str);
        System.out.println(result);
    }

    private static String countingMap(String str) {
        String[] strArr = str.split(" ");
        Map<String, Integer> strMap = new HashMap<>();
        for (String temp : strArr) {
            Integer integer = strMap.get(temp);
            if (integer == null)
                strMap.put(temp, 1);
            else {
                strMap.put(temp, integer + 1);
            }
        }
        return strMap.toString();
    }
}

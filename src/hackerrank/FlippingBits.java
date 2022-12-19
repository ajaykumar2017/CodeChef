package hackerrank;

import java.io.IOException;
import java.util.Scanner;

// Question Link: https://www.hackerrank.com/challenges/flipping-bits/problem?isFullScreen=true
// All Test Cases Passed
public class FlippingBits {

    /**
     * Step 1: Convert the number to binary.
     * Step 2: Flip the binary number
     * Step 3: Calculate the value of the binary number
     */
    public static long flippingBits(long n) {
        // Write your code here
        StringBuilder convertedToBinary = convertToBinary(n);
        StringBuilder flippedBinaryNumber = flipBits(convertedToBinary);
        return convertBinaryToDecimalNumber(flippedBinaryNumber);
    }

    private static StringBuilder flipBits(StringBuilder number) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '0') result.append("1");
            else result.append('0');
        }
        return result;
    }

    private static StringBuilder convertToBinary(long number) {
        StringBuilder result = new StringBuilder();
        while (number != 1 && number != 0) {
            result.append(number % 2);
            number /= 2;
        }
        result.append(number % 2);
        // 32 bits
        StringBuilder beforeBit = new StringBuilder();
        beforeBit.append("0".repeat(Math.max(0, 32 - result.length())));
        return beforeBit.append(result.reverse());
    }

    private static long convertBinaryToDecimalNumber(StringBuilder number) {
        number.reverse();
        long result = 0;
        int counter = 0;
        for (int i = 0; i < number.length(); i++) {
            result = (long) (result + Integer.parseInt(String.valueOf(number.charAt(i))) * Math.pow(2, counter++));
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            long n = sc.nextLong();
            long result = flippingBits(n);
            System.out.println(result);
        }

        sc.close();
    }
}

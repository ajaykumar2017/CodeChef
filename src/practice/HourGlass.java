package practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HourGlass {

    // Complete the hourglassSum function below.
    private static int hourglassSum(int[][] arr) {
        int[][] temp=new int[4][4];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++){
                temp[i][j]=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+
                        arr[i+2][j+1]+arr[i+2][j+2];
            }
        }

        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (temp[i][j] > maxElement) {
                    maxElement = temp[i][j];
                }
            }
        }



        for(int i=0;i<4;i++)
        {
            for (int j=0;j<4;j++)
                System.out.print(temp[i][j]+" ");
            System.out.println();
        }
        return maxElement;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
            scanner.nextLine();
        }

        int result = hourglassSum(arr);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
        System.out.println("Result is: "+result);

        scanner.close();
    }
}


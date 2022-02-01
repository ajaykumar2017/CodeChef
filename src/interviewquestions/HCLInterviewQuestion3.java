package interviewquestions;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Question:
 * Given two sorted arrays, the task is to merge them in a sorted manner.
 * Examples:
 * <p>
 * Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8}
 * Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}
 * Input: arr1[] = { 5, 8, 9}, arr2[] = {4, 7, 8}
 * Output: arr3[] = {4, 5, 7, 8, 8, 9}
 */
public class HCLInterviewQuestion3 {
    public static final Scanner scanner = new Scanner(System.in);

    public static int[] mergerSortedArray(int[] arr1, int[] arr2, int m, int n) {
        int totLength = m + n;
        int m1 = 0, n1 = 0, k = 0;
        int[] arr3 = new int[totLength];

        // traversing in both the array
        while (m1 < m && n1 < n) {
            arr3[k++] = arr1[m1] <= arr2[n1] ? arr1[m1++] : arr2[n1++];
        }

        // store remaining elements of arr1
        while (m1 < m)
            arr3[k++] = arr1[m1++];

        // store remaining elements of arr2
        while (n1 < n)
            arr3[k++] = arr2[n1++];

        return arr3;
    }

    public static void main(String[] args) {
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String[] arrStr1 = str1.trim().split(" ");
        int[] arr1 = new int[arrStr1.length];
        for (int i = 0; i < arrStr1.length; i++) {
            arr1[i] = Integer.parseInt(arrStr1[i]);
        }

        String[] arrStr2 = str2.trim().split(" ");
        int[] arr2 = new int[arrStr2.length];
        for (int i = 0; i < arrStr2.length; i++) {
            arr2[i] = Integer.parseInt(arrStr2[i]);
        }

        int[] result = mergerSortedArray(arr1, arr2, arr1.length, arr2.length);
        System.out.println(Arrays.toString(result));
    }
}

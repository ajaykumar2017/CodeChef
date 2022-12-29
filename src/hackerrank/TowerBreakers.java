package hackerrank;

// Problem Link: https://www.hackerrank.com/challenges/tower-breakers-1/problem?isFullScreen=false

import java.util.Scanner;

public class TowerBreakers {

    public static final Scanner scanner = new Scanner(System.in);

    public static int towerBreakers(int n, int m) {
        // Write your code here
        // If m is 1 then player 2 will win always
        if (m == 1) return 2;
        // if the value of n is odd then player 1 will always
        if (n % 2 == 1) return 1;
        // if the value of n is even then player 2 will win always
        else return 2;

    }

    public static void main(String[] args) {
        // Input
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            System.out.println(towerBreakers(n, m));
        }
    }
}

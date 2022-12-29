package hackerrank;

// Problem Link: https://www.hackerrank.com/challenges/a-chessboard-game-1/problem?isFullScreen=false&h_r=next-challenge&h_v=zen
// All Test Cases Passed
import java.util.Scanner;

public class AChessBoardGame {

    private static final Scanner scanner = new Scanner(System.in);

    public static String chessboardGame(int x, int y) {
        // If either the row or column is even, the first player wins
        // If either the row or column is odd, the first player wins
        x--;
        y--;
        if ((x / 2) % 2 == 0 && (y / 2) % 2 == 0) return "Second";
        return "First";
    }

    public static void main(String[] args) {

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(chessboardGame(x, y));
        }
    }
}

package tcsfrescoplay.miniprojectjavacompletebeginner;


import java.io.IOException;
import java.util.Scanner;
// All test cases passed
class Result {
    public static String[] calculateGrade(int[][] students_marks) {
        String[] result = new String[students_marks.length];
        for (int i = 0; i < students_marks.length; i++) {
            int sum = 0;
            for (int j = 0; j < students_marks[0].length; j++) {
                sum = sum + students_marks[i][j];
            }
            int average = sum / (students_marks[0].length);
            if (average >= 90) result[i] = "A+";
            if (average >= 80 && average < 90) result[i] = "A";
            if (average >= 70 && average < 80) result[i] = "B";
            if (average >= 60 && average < 70) result[i] = "C";
            if (average >= 50 && average < 60) result[i] = "D";
            if (average < 50) result[i] = "F";

        }
        return result;
    }

}

public class JavaControlFlowStatements {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int students_marksRows = Integer.parseInt(sc.next().trim());
        int students_marksColumns = Integer.parseInt(sc.next().trim());


        int[][] students_marks = new int[students_marksRows][students_marksColumns];
        for (int i = 0; i < students_marksRows; i++) {
            for (int j = 0; j < students_marksColumns; j++) {
                students_marks[i][j] = Integer.parseInt(sc.next().trim());
            }
        }

        String[] result = Result.calculateGrade(students_marks);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        sc.close();
    }
}

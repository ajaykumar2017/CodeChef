package tcsfrescoplay.miniprojectjavacompletebeginner;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.DecimalFormat;
import java.util.Scanner;

abstract class Student {
    public abstract String result(String MarksOfStudent);
}

class Aided extends Student {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public String result(String allMarks) {
        String result = null;
        int maxCredit = 5;
        String[] mark = allMarks.split("\\|");
        String subjectMarks = mark[0];
        String nccMarks = mark[1];
        String sportMarks = mark[2];
        double grade = 0.0;

        int noOfCredits = 0;
        // Subject Marks
        String[] sMc = subjectMarks.split(",");
        noOfCredits += sMc.length;
        for (String s : sMc) {
            String[] temp = s.split(" ");
            grade += (calculatingGradePoint(Integer.parseInt(temp[0])) *
                    Integer.parseInt(temp[1]));
        }

        // NCC Marks
        String[] nMc = nccMarks.split(",");
        if (!nMc[0].equals("0")) {
            grade += (calculatingGradePoint(Integer.parseInt(nMc[1])) *
                    Integer.parseInt(nMc[2]));
            noOfCredits++;
        }

        // Sports Marks
        String[] spMc = sportMarks.split(",");
        if (!spMc[0].equals("0")) {
            grade += (calculatingGradePoint(Integer.parseInt(spMc[1])) *
                    Integer.parseInt(spMc[2]));
            noOfCredits++;
        }

        double res = grade / (noOfCredits * maxCredit);

        return df.format(res);
    }

    public double calculatingGradePoint(int marks) {
        double start;
        double end;
        double grade = 0.0;
        if (marks >= 75) {
            start = 9.0;
            end = 10.0;
            grade = start + ((end - start) / 25) * (marks - 75);
        } else if (marks >= 60) {
            start = 8.0;
            end = 8.9;
            grade = start + ((end - start) / 14) * (marks - 60);
        } else if (marks >= 50) {
            start = 7.0;
            end = 7.9;
            grade = start + ((end - start) / 9) * (marks - 50);
        } else if (marks >= 40) {
            start = 6.0;
            end = 6.9;
            grade = start + ((end - start) / 9) * (marks - 40);
        }
        return grade;
    }
}

class SelfFinance extends Student {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public String result(String allMarks) {
        String result = null;
        int maxCredit = 5;
        String[] mark = allMarks.split("\\|");
        String subjectMarks = mark[0];
        String sportMarks = mark[1];
        double grade = 0.0;

        int noOfCredits = 0;
        // Subject Marks
        String[] sMc = subjectMarks.split(",");
        noOfCredits += sMc.length;
        for (String s : sMc) {
            String[] temp = s.split(" ");
            grade += (calculatingGradePoint(Integer.parseInt(temp[0])) *
                    Integer.parseInt(temp[1]));
        }

        // Sports Marks
        String[] spMc = sportMarks.split(",");
        if (!spMc[0].equals("0")) {
            grade += (calculatingGradePoint(Integer.parseInt(spMc[1])) *
                    Integer.parseInt(spMc[2]));
            noOfCredits++;
        }

        double res = grade / (noOfCredits * maxCredit);

        return df.format(res);
    }

    public double calculatingGradePoint(int marks) {
        double start;
        double end;
        double grade = 0.0;
        if (marks >= 75) {
            start = 9.0;
            end = 10.0;
            grade = start + ((end - start) / 25) * (marks - 75);
        } else if (marks >= 60) {
            start = 8.0;
            end = 8.9;
            grade = start + ((end - start) / 14) * (marks - 60);
        } else if (marks >= 50) {
            start = 7.0;
            end = 7.9;
            grade = start + ((end - start) / 9) * (marks - 50);
        } else if (marks >= 40) {
            start = 6.0;
            end = 6.9;
            grade = start + ((end - start) / 9) * (marks - 40);
        }
        return grade;
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String aided = scanner.nextLine();
        String finance = scanner.nextLine();
        Aided ad = new Aided();
        SelfFinance selfFinance = new SelfFinance();
        System.out.println(ad.result(aided));
        System.out.println(selfFinance.result(finance));
        System.out.println(ad.result(aided).hashCode());
        //System.out.println(testAbstract());
    }

    public static boolean isTestAbstract() {
        Method[] methods = Student.class.getMethods();
        boolean a = false;
        for (int i = 0; i < methods.length; i++) {
            a = Modifier.isAbstract(methods[i].getModifiers());
            if (a == true)
                break;
        }
        return a;
    }
}

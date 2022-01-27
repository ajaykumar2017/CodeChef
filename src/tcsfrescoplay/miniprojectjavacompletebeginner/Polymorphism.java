package tcsfrescoplay.miniprojectjavacompletebeginner;

import java.util.Scanner;

// All test cases passed
class Parent {
    public int startElement;
    public int endElement;

    String filter(int startElement, int endElement) {
        return null;
    }
}

class ChildOne extends Parent {
    // return all prime numbers
    @Override
    String filter(int startElement, int endElement) {
        StringBuilder result = new StringBuilder();
        for (int i = startElement; i <= endElement; i++) {
            if (isPrime(i)) result.append(i).append(" ");
        }
        return result.toString().trim();
    }

    boolean isPrime(int n) {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}

class ChildTwo extends Parent {
    //return happy numbers
    @Override
    String filter(int startElement, int endElement) {
        StringBuilder result = new StringBuilder();
        for (int i = startElement; i <= endElement; i++) {
            if (isHappyNumber(i))
                result.append(i).append(" ");
        }
        return result.toString().trim();
    }

    static int numSquareSum(int n)
    {
        int squareSum = 0;
        while (n!= 0)
        {
            squareSum += (n % 10) * (n % 10);
            n /= 10;
        }
        return squareSum;
    }

    //  method return true if n is Happy number
    static boolean isHappyNumber(int n)
    {
        int slow, fast;

        //  initialize slow and fast by n
        slow = fast = n;
        do
        {
            //  move slow number
            // by one iteration
            slow = numSquareSum(slow);

            //  move fast number
            // by two iteration
            fast = numSquareSum(numSquareSum(fast));

        }
        while (slow != fast);

        //  if both number meet at 1,
        // then return true
        return (slow == 1);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        ChildOne one = new ChildOne();
        ChildTwo two = new ChildTwo();
        System.out.println(one.filter(start, end));
        System.out.println(two.filter(start, end));
    }
}

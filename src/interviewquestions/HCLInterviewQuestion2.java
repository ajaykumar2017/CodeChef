package interviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Calculate the sum of the numbers (1, 2, 3, 4, 5) using stream api
 */
public class HCLInterviewQuestion2 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        // Method 1 : Using Stream.reduce()
        Integer sum = integers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Using Stream.reduce() the sum is -> " + sum);

        // Method 2: Using Stream.collect()
        Integer sum1 = integers.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Using Stream.collect() the sum is -> " + sum1);

        // Method 3 : Using IntStream.sum()
        Integer sum2 = integers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Using IntStream.sum() the sum is -> " + sum2);

        // Method 4 : Using Stream#sum With Map
        Integer sum3 = integers.stream().mapToInt(x -> x).sum();
        System.out.println("Using IntStream.sum() the sum is -> " + sum3);
    }
}

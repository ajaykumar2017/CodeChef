package dsaUsingJava.sortingAlgorithms.challenge;

/**
 * Change Insertion Sort so that it uses Recursion
 */
public class Challenge2 {
    /*
    Time Complexity: O(n^2)
     */
    public static void main(String[] args) {

        int[] intArray = {-15, 7, 20, 5, 40, 55, 42, -9};

        insertionSort(intArray, intArray.length);

        for (int value : intArray) {
            System.out.println(value);
        }
    }

    private static void insertionSort(int[] input, int numItems) {
        if (numItems < 2) return;

        insertionSort(input, numItems - 1);

        int newElement = input[numItems - 1];

        int i;

        for (i = numItems - 1; i > 0 && input[i - 1] > newElement; i--) {
            input[i] = input[i - 1];
        }

        input[i] = newElement;

        System.out.println("Call when numItems = " + numItems);
        for (int value : input) {
            System.out.print(value+" ,");
        }
        System.out.println("\n--------------------------------");

    }
}

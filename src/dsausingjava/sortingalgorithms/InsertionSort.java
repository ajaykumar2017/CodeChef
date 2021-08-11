package dsausingjava.sortingalgorithms;

public class InsertionSort {
    /*
    Time Complexity: O(n^2)
     */
    public static void main(String[] args) {

        int[] intArray = {-15, 7, 20, 5, 40, 55, 42, -9};

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;
            firstUnsortedIndex++) {

            int element = intArray[firstUnsortedIndex];

            int i;

            for(i = firstUnsortedIndex; i > 0 && intArray[i - 1] > element; i--) {

                intArray[i] = intArray[i - 1];
            }

            intArray[i] = element;
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}

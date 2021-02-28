package dsaUsingJava.sortingAlgorithms;

public class SelectionSort {
    /*
    Time Complexity: O(n^2)
     */
    public static void main(String[] args) {

        int[] intArray = {-15, 7, 20, 5, 40, 55, 42, -9};

        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
            lastUnsortedIndex--) {

            int largest  = 0;

            for(int i = 1; i <= lastUnsortedIndex; i++) {

                if(intArray[i] > intArray[largest])
                    largest = i;
            }

            swap(intArray, largest, lastUnsortedIndex);
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

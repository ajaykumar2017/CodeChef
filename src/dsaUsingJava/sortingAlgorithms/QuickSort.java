package dsaUsingJava.sortingAlgorithms;

public class QuickSort {
    /**
     * Time Complexity: O(nlogn)
     */
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        quickSort(intArray, 0, intArray.length - 1);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    private static void quickSort(int[] input, int start, int end) {
        if (start < end) {
            int pi = partition(input, start, end);
            quickSort(input, start, pi - 1);
            quickSort(input, pi + 1, end);
        }
    }

    private static int partition(int[] input, int start, int end) {
        int i = start - 1;
        int pivot = input[end];

        for (int j = start; j <= end - 1; j++) {
            if(input[j] <= pivot) {
                i = i + 1;
                swap(input, i, j);
            }
        }

        swap(input, i + 1, end);
        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        if (i == j) return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

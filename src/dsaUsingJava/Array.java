package dsaUsingJava;

public class Array {
    public static void main(String[] args) {
        int[] intArray = new int[7];
        intArray[0] = 7;
        intArray[1] = -34;
        intArray[2] = 34;
        intArray[3] = 67;
        intArray[4] = -27;
        intArray[5] = 54;
        intArray[6] = 45;

        int index = -1;
        for(int i = 0; i < intArray.length; i++) {
            if(intArray[i] == 67) {
                index = i;
                break;
            }
        }

        System.out.println("index is: " + index);
    }
}

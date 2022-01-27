package tcsfrescoplay.miniprojectjavacompletebeginner;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// All test cases passed
class Register {

    /*
     * Complete the 'getTotalBill' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts MAP itemDetails as parameter.
     */
    public static Register getInstance() {
        return new Register();
    }

    public String getTotalBill(Map<String, Integer> itemDetails) {
        double result = 0.0;
        for (Map.Entry<String, Integer> entry : itemDetails.entrySet()) {
            result += (getPriceOfItem(entry.getKey()) * entry.getValue());
        }
        return Double.toString(result);
    }

    public Double getPriceOfItem(String item) {
        HashMap<String, Double> itemsPrice = new HashMap<>();
        itemsPrice.put("apple", 2.0);
        itemsPrice.put("orange", 1.5);
        itemsPrice.put("mango", 1.2);
        itemsPrice.put("grape", 1.0);
        return itemsPrice.get(item);
    }

}

public class ClassesAndObjectsBilling {
    public static void main(String[] args) throws IOException {

        Scanner readInput = new Scanner(System.in);
        String[] input = readInput.nextLine().split(" ");
        Map<String, Integer> myItems = new HashMap<>();
        for (int i = 0; i < input.length; i += 2) {
            myItems.put(input[i], Integer.parseInt(input[i + 1]));
        }
        Register regObj = Register.getInstance();
        System.out.println(regObj.getTotalBill(myItems));
        readInput.close();

    }
}

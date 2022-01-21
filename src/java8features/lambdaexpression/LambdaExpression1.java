package java8features.lambdaexpression;

import java.util.ArrayList;

public class LambdaExpression1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(7);
        arrayList.add(11);
        arrayList.add(9);
        /**
         * Use a lamba expression in the ArrayList's forEach() method to print every item in the list
         */
        arrayList.forEach( (n) -> System.out.println(n));
    }
}

package Algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class MinMaxFind {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1000);
        numbers.add(999);
        numbers.add(0);

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        System.out.println("The minimum number is "+ min);
        System.out.println("The maximum number is "+ max);
    }
}

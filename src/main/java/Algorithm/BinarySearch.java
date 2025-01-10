package Algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        int position = Collections.binarySearch(numbers, 300);
        System.out.println("The position of 300 is: " + position);
    }
}

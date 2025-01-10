package Algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class SortingAlgorithm {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(999);
        numbers.add(212);
        numbers.add(333);
        System.out.println("unsorted numbers: " + numbers);
        Collections.sort(numbers);

        System.out.println("sorted numbers " + numbers);
    }
}

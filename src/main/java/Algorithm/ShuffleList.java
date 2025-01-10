package Algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("in order: " + list);
        Collections.shuffle(list);
        System.out.println("in random order: " + list);
    }
}

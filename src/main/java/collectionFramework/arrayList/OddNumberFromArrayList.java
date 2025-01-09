package collectionFramework.arrayList;

import java.util.ArrayList;

public class OddNumberFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(2);
        lists.add(3);
        lists.add(4);
        lists.add(5);

        for(int list: lists ) {
            if (list % 2 != 0) {
                System.out.println(list);
            }
        }


    }
}

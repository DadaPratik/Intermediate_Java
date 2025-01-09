package collectionFramework.arrayList;

import java.util.ArrayList;

public class AccessItemFromArrayList {
    public static void main(String[] args) {

        ArrayList<String> item = new ArrayList<String>();
        item.add("Chocolate");
        item.add("Ice cream");
        item.add("Cappuccino");

        System.out.println(item);
        String element = item.get(0);
        System.out.println(element);
    }
}

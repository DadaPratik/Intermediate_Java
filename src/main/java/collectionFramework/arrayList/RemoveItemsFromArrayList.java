package collectionFramework.arrayList;

import java.util.ArrayList;

public class RemoveItemsFromArrayList {

    public static void main(String[] args) {
        ArrayList<String> item = new ArrayList<>();
        item.add("Chocolates");
        item.add("Ice cream");
        item.add("Cappuccino");

        System.out.println("Original ArrayList: " + item);

        item.remove(1);
        System.out.println("After removing: " + item);
    }
}

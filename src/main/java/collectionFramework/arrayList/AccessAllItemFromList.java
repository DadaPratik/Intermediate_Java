package collectionFramework.arrayList;

import java.util.ArrayList;

public class AccessAllItemFromList {

    public static void main(String[] args) {

        ArrayList<String> item = new ArrayList<String>();
        item.add("Chocolate");
        item.add("Ice Cream");
        item.add("Potato");

        for(String itemName : item) {
            System.out.println(itemName);
        }
    }
}

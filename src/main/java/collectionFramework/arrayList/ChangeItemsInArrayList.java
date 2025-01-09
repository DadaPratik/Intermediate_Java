package collectionFramework.arrayList;

import java.util.ArrayList;

public class ChangeItemsInArrayList {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Rosie");
        names.add("Smith");
        names.add("John");

        System.out.println("Original names: " + names);

        names.set(0,"Rose");
        System.out.println("New names: " + names);

    }
}

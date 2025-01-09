package hashSet;

import java.util.HashSet;

public class DuplicateItemsInSet {

    public static void main(String[] args) {

        HashSet<String> animals = new HashSet<>();
        animals.add("cat");
        animals.add("elephant");
        animals.add("dog");
        animals.add("cat");
        System.out.println(animals);

    }
}

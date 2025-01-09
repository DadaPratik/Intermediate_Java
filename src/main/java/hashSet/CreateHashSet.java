package hashSet;

import java.util.HashSet;

public class CreateHashSet {

    public static void main(String[] args) {

        HashSet<String> animals = new HashSet<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("elephant");
        System.out.println(animals);
    }
}

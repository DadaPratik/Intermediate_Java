package hashSet;

import java.util.HashSet;

public class IsSubSet {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println("set1: " + set);

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);

        System.out.println("set2: " + set1);

        String result = set.containsAll(set1) ? "Set2 is subset of set1": "Set2 is not subset of set1";
        System.out.println(result);
    }
}

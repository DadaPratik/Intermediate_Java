package hashMap;

import java.util.HashMap;

public class RemoveHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "A");
        students.put(5, "B");
        students.put(3, "C");

        System.out.println("list: " + students);

        System.out.println("the removed items is " + students.remove(5));
        System.out.println("list: " + students);
    }
}

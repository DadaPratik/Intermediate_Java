package hashMap;

import java.util.HashMap;

public class ChangeHashMapElements {

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "A");
        students.put(2, "B");
        students.put(3, "C");
        System.out.println("original students: " + students);

        students.replace(2, "D");
        System.out.println("new students: " + students);
    }
}

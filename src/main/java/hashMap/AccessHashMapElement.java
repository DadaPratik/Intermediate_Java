package hashMap;

import java.util.HashMap;

public class AccessHashMapElement {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Jack");
        students.put(2, "Emily");
        students.put(7, "Zayn");
        String value = students.get(7);
        System.out.println(value);
    }
}

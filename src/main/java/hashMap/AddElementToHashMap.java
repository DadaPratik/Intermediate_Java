package hashMap;

import java.util.HashMap;

public class AddElementToHashMap {

    // we will use put to add elements in hashMap

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Sandeep");
        students.put(2, "Michael");
        students.put(3, "Pratik");

        System.out.println(students);
    }
}

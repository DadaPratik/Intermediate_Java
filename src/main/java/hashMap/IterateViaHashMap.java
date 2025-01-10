package hashMap;

import java.util.HashMap;

public class IterateViaHashMap {

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "A");
        students.put(2, "B");
        students.put(3, "C");

        for(int key: students.keySet()){
            System.out.println(key + " : " +  students.get(key));
        }
    }
}

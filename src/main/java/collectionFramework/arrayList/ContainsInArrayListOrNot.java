package collectionFramework.arrayList;

import java.util.ArrayList;

public class ContainsInArrayListOrNot {

    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("JavaScript");
        courses.add("Ruby");
        courses.add("JavaScript");


        System.out.println(courses);

        String result = courses.contains("Java") ? "Java is available" : "Java is not available";
        System.out.println(result);
    }
}

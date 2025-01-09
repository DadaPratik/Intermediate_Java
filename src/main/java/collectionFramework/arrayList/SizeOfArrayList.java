package collectionFramework.arrayList;

import java.util.ArrayList;

public class SizeOfArrayList {

    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Ruby");
        System.out.println(languages);
        System.out.println(languages.size());
    }
}

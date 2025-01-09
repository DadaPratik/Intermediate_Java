package collectionFramework.arrayList;

import java.util.ArrayList;

public class AddAllInArrayList {

    public static void main(String[] args) {
        ArrayList<String> asianCountries = new ArrayList<>();

        asianCountries.add("Nepal");
        asianCountries.add("China");
        asianCountries.add("India");

        System.out.println("Assian Countries: " + asianCountries);

        ArrayList<String> countries = new ArrayList<>();
        countries.add("Bhutan");
        countries.addAll(asianCountries);
        System.out.println("Countries: " + countries);
    }
}

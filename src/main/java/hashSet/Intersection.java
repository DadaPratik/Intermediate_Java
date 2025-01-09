package hashSet;

import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        HashSet<String> domesticAnimals = new HashSet<>();
        domesticAnimals.add("Cat");
        domesticAnimals.add("dog");
        domesticAnimals.add("goat");
        domesticAnimals.add("elephant");

        HashSet<String> wildAnimals = new HashSet<>(domesticAnimals);
        wildAnimals.add("Tiger");
        wildAnimals.add("elephant");
        wildAnimals.add("Wolf");
        domesticAnimals.retainAll(wildAnimals);
        System.out.println(domesticAnimals);
    }
}

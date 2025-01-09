package hashSet;

import java.util.HashSet;

public class Difference {
    //removeAll()

    public static void main(String[] args) {
        HashSet<String> domesticAnimals = new HashSet<>();
        domesticAnimals.add("Cat");
        domesticAnimals.add("dog");
        domesticAnimals.add("elephant");

        HashSet<String> wildAnimals = new HashSet<>();
        wildAnimals.add("elephant");
        wildAnimals.add("tiger");
        wildAnimals.add("wolf");

        domesticAnimals.removeAll(wildAnimals);
        System.out.println(domesticAnimals);
    }
}

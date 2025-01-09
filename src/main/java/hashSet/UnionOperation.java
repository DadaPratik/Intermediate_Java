package hashSet;

import java.util.HashSet;

public class UnionOperation {
    public static void main(String[] args) {

        HashSet<String> domesticAnimals = new HashSet<>();
        domesticAnimals.add("Cat");
        domesticAnimals.add("Dog");
        domesticAnimals.add("goat");

        HashSet<String> wildAnimals = new HashSet<>();
        wildAnimals.add("Lion");
        wildAnimals.add("Tiger");
        wildAnimals.add("elephant");

        // union of wildAnimal and domesticAnimal
        //addAll()
        domesticAnimals.addAll(wildAnimals);
        System.out.println(domesticAnimals);
    }
}

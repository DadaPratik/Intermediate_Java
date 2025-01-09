package hashSet;

import java.util.HashSet;

public class FinalTouchINHashSet {

    public static void main(String[] args) {
        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);

        System.out.println("even numbers: " + evenNumbers);

        HashSet<Integer> primeNumber = new HashSet<>();
        primeNumber.add(2);
        primeNumber.add(3);
        primeNumber.add(5);
        System.out.println("primeNumber: " + primeNumber);

        evenNumbers.addAll(primeNumber);
        System.out.println("Union: " + evenNumbers);

        evenNumbers.retainAll(primeNumber);
        System.out.println("Intersection: " + evenNumbers);

        evenNumbers.removeAll(primeNumber);
        System.out.println("Difference: " + evenNumbers);


    }
}

package linkedList;

import java.util.LinkedList;

public class AccessElementInLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        int element = numbers.get(0);
        System.out.println(element);
    }
}

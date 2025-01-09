package queue;

import java.util.LinkedList;

public class DeQueue {

    public static void main(String[] args) {

        // addFirst()
        //addLast()
        //removeFirst()
        //removeLast()

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers);

        numbers.addFirst(0);
        System.out.println(numbers);
        numbers.addLast(5);
        System.out.println(numbers);

        numbers.removeFirst();
        numbers.removeLast();
        System.out.println(numbers);


    }
}

package queue;

import java.util.LinkedList;

public class LinkedListAsQueue {
    // poll() - removes element from the front
    // offer() - add element from the back

    public static void main(String[] args) {

        LinkedList<String> patient = new LinkedList<String>();
        patient.add("1st patient");
        patient.add("2nd patient");
        patient.add("3rd patient");

        System.out.println("original linkedList: " + patient);

        patient.poll();

        System.out.println("after poll: " + patient);

        patient.offer("4th patient");
        System.out.println("after offer: " + patient);

    }
}

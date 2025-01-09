package linkedList;

import java.util.LinkedList;

public class ChangeElementOfLinkedList {

    public static void main(String[] args) {

        LinkedList<String> movies = new LinkedList<>();
        movies.add("Forest Gump");
        movies.add("The Hangover");
        movies.add("Titanice");

        System.out.println("Original list " + movies);

        movies.set(1,"Spiderman");
        System.out.println("New list " + movies);
    }
}

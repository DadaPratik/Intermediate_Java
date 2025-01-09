package linkedList;

import java.util.LinkedList;

public class RemoveElementFromLinkedList {

    public static void main(String[] args) {
        LinkedList<String> movies = new LinkedList<>();
        movies.add("Forest Gump");
        movies.add("The HangOver");
        movies.add("Titanic");

        System.out.println("Original List: " + movies);
        movies.remove(0);
        System.out.println("After removing: " + movies);
    }
}

package linkedList;

import java.util.LinkedList;

public class AddElementToLinkedList {

    public static void main(String[] args) {

        LinkedList<String> movies = new LinkedList<>();
        movies.add("Forest Gump");
        movies.add("The Hangover");
        movies.add("Titanice");
        System.out.println("original list: " + movies);

        movies.add(1,"Spiderman");
        movies.add(4,"Moonlight");
        System.out.println("new list: " + movies);
    }
}

package linkedList;

import java.util.LinkedList;

public class IteratingInLinkedList {

    public static void main(String[] args) {
        LinkedList<String> movies = new LinkedList<>();
        movies.add("Forest GUmp");
        movies.add("The Hangover");
        movies.add("Titanic");

        for(String movie : movies) {
            System.out.println(movie);

        }
    }
}

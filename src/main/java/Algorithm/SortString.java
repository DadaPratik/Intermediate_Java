package Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortString {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first name:");
        String name1 = scanner.nextLine();

        System.out.print("Enter the second name:");
        String name2 = scanner.nextLine();

        System.out.print("Enter the first name:");
        String name3 = scanner.nextLine();

        names.add(name1);
        names.add(name2);
        names.add(name3);
        Collections.sort(names);
        System.out.println(names);
    }
}

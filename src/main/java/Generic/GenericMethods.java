package Generic;

import java.util.Scanner;

public class GenericMethods {
    public <T> void display(T data) {
        System.out.println(data);
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String text = input.nextLine();

        System.out.println("Enter the number: ");
        double number = input.nextDouble();

        gm.<String>display(text);
        gm.<Double>display(number);
        input.close();

    }
}

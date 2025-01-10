package exceptionHandling;

import java.util.Scanner;

public class ThrowReleventMessage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Please enter a number: ");
            int number = scanner.nextInt();
            System.out.println("Please enter a number: ");
            int number2 = scanner.nextInt();

            int result = number/number2;
            System.out.println(result);

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

package exceptionHandling;

import java.util.Scanner;

public class DivideBy0 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Please enter a numerator:");
            double numerator = input.nextDouble();
            System.out.println("Please enter a denominator:");
            double denominator = input.nextDouble();

            double result = numerator / denominator;
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

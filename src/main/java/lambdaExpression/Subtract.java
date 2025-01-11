package lambdaExpression;

import java.util.Scanner;

@FunctionalInterface
public interface Subtract {
    public void subtract(int a, int b);
}
class Main2 {
    public static void main(String[] args) {
        Subtract s = (int x, int y)->{
            System.out.println("The subtract  is " + (x-y));

        };

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter the value of num2: ");

        int num2 = input.nextInt();
        s.subtract(num1,num2);
    }
}
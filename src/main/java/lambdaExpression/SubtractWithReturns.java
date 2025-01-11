package lambdaExpression;

import java.util.Scanner;

@FunctionalInterface
public interface SubtractWithReturns {

    public int subtract(int a, int b);
}


class Main5 {
    public static void main(String[] args) {
        SubtractWithReturns ref = (int x, int y) -> {
            return x - y;
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the value of num1: ");

        int num2 = scanner.nextInt();

        int result = ref.subtract(num1, num2);
        System.out.println("The result is: " + result);
    }
}
package monisha.labfat;

import java.util.Scanner;

public class factorial{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        scanner.close();

        int factorial = FactorialCalculator.calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}

class FactorialCalculator {
    public static int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

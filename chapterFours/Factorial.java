package chapterFours;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a nonNegative integer from the user
        System.out.print("Enter a nonNegative integer: ");
        int n = scanner.nextInt();

        // Compute the factorial of the integer
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        // Print the result
        System.out.println(n + "! = " + factorial);
    }
}

package loopPractise;

import java.util.Scanner;

public class FibronaciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int number = scanner.nextInt();

        int result = fibonacci(number);
        System.out.println("The " + number + "th Fibonacci number is: " + result);
    }

    public static int fibonacci(int number) {
        int previousNumber = 0;
        int currentNumber = 1;
        int fib = 0;


        if (number <= 1) {
            return number;
        }

        for (int i = 2; i <= number; i++) {
            fib = previousNumber + currentNumber;
            previousNumber = currentNumber;
            currentNumber= fib;
        }

        return fib;
    }
}



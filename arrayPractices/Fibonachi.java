package arrayPractices;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
//        Given an integer, , perform the following conditional actions:
//
//        If  is odd, print Weird
//        If  is even and in the inclusive range of  to , print Not Weird
//        If  is even and in the inclusive range of  to , print Weird
//        If  is even and greater than , print Not Weird
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int n = scanner.nextInt();
        if (n % 2 == 1) {    // if n is odd
            System.out.println("Weird");
        } else if (n >= 2 && n <= 5) {    // if n is even and between 2 and 5 (inclusive)
            System.out.println("Not Weird");
        } else if (n >= 6 && n <= 20) {    // if n is even and between 6 and 20 (inclusive)
            System.out.println("Weird");
        } else {    // if n is even and greater than 20
            System.out.println("Not Weird");
        }

        scanner.close();
    }
}

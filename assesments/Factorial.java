package assesments;

import ChapterThree.Account;

import java.util.Arrays;
import java.util.Scanner;

public class Factorial {
    public static void displayFactorial(int number) {
        int copy = number;
        System.out.print(number);
        for (int i = number - 1; i > 0; i--) {
            System.out.print(" * "+i);
            number *= i;
        }
        System.out.println();
        System.out.println(copy+"! ==> "+number);
    }

    public static void main(String[] args) {
        int [] numbers = new int[8];
        for (int element: numbers) {
            System.out.println(element);
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[2]);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        int [][]number2 = new int [7][5];
        for (int i = 0; i < number2.length; i++) {
            Arrays.fill(number2[i], i);
        }
        System.out.println(Arrays.deepToString(number2));

        for (int [] num: number2) {
            System.out.println(Arrays.toString(num));
        }
    }

}

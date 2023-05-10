package ChapterSix;

import java.util.Scanner;

public class CalculatingSumDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int number = input.nextInt();
        sumDigits(number);
    }
    public static void sumDigits(int number) {
        int sum =0;
        while (number != 0) {
            int reverse = number % 10;
            number /= 10;
            sum+=reverse;
        }
        System.out.println("the sum is"+sum);
    }
}
package ChapterThree;

import java.util.Scanner;

public class SheriffHomework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int number = input.nextInt();
        if (number < 0) {
            System.out.println("number is negative number");
        }
        else {
            System.out.println("number is a positive number");
        }
    }
}
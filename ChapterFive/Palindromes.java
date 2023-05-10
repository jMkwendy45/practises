package ChapterFive;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five digit numbers");
        int number = input.nextInt();
            if (number !=5) {
                System.out.println("error,Enter another number");
                int number2 = input.nextInt();
                System.out.println(number2);
            }
        }


    }


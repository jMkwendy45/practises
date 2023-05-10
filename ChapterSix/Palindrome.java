package ChapterSix;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        reverseNumber(number);


    }

    public static  void reverseNumber(int number){
        int reverse = 0;
        while(number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
            if(number!=reverse){
                System.out.println("number is  a palindrome");
            }
            else {
                System.out.println("number is a palindrome");
            }
        }

    }



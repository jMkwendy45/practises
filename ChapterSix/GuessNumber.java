package ChapterSix;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int number = (int)(Math.random()* 101);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a  magic number between 0-100");
        int guess = -1;

        while (guess!=number) {
            System.out.println("enter your guess");
            guess = input.nextInt();

            if (guess == number) {
                System.out.println("yes the number is" + number);
            } else if (guess>number) {
                System.out.println("your number is too high");


            }
            else {
                System.out.println("your number is too low");
            }

        }








    }


}

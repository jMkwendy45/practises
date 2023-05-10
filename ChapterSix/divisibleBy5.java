package ChapterSix;

import java.util.Scanner;

public class divisibleBy5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        while (counter <= 10) {
            System.out.println("enter a number");
            int number = input.nextInt();
            System.out.println(isMultiple(number));
            counter++;
        }
    }

    public static boolean isMultiple(int number) {

            if (number % 5 == 0) {
                return true;
            }
                 return false;
             }
}
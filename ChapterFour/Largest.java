package ChapterFour;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = 0;
        int largest = 0;

        int counter = 1;
        while (counter < 10) {
            number = input.nextInt();
            if (number>largest){
                largest = number;
                System.out.println("the largest is"+largest);
            }
            counter++;
            System.out.println("Enter a number");

        }
            System.out.println(number);
         {


        }

    }
}

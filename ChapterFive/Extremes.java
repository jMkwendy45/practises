package ChapterFive;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many values do you want to input? ");
        int numValues = input.nextInt();


        int min =  Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numValues; i++) {
//            System.out.println("enter a value");
            System.out.print("Enter value #" + (i+1) + ": ");
            int value = input.nextInt();
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        int sum = min + max;
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Sum of the two extremes: " + sum);
    }
}

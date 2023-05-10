package PersonalPractise;

import java.util.Scanner;

public class CountPositive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a positive or a negative integer,press 0 to quit");
        int positive = 0;
        int negative=0;
        int total = 0;
        //int average =0;


        int number = 1;
        while (number != 0) {
            number = input.nextInt();
              total +=number;
            if (number < 0) {
                positive++;
            } else if (number > 0) {
                negative++;
            } else {
                System.out.println("no num entered");
            }
            System.out.println(number);

        }



             System.out.println("the positive numbers are"+positive);
            System.out.println("the negative numbers are"+negative);
              System.out.println("the total is"+total);
       // System.out.println(average);
        }
    }



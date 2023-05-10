package chapterFours;

import java.util.Scanner;

public class SpecifiedSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("Enter a number");
         int number = input.nextInt();
         System.out.println("enter another number");
           int sum = input.nextInt();
          while (number> sum) {
            System.out.println("enter another number");
            int number2 = input.nextInt();
            sum+=number2;
            }
        System.out.println("number is greater than"+number+"number is greater than sum"+sum);
        }

    }




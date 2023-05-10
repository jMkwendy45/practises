package ChapterSix;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("enter a number");
           int number = input.nextInt();
          perfectNumber(number);

    }

    public static void perfectNumber(int number) {
          int sum =0;
        for (int i = 1; i <=number/2; i++) {
            if (number % i == 0) {
                sum += i;
                System.out.println(i);
            }
        }
            if (sum==number){
                System.out.println("number is perfect");
            }
            else {
                System.out.println("numb is not perfect");
            }

    }
    }



package PersonalPractise;

import java.util.Scanner;

public class DigitInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer between 0 and 1000");
        int integer = input.nextInt();

        int numberLessThanTen = integer%10;
        integer/=10;
        System.out.println(integer);

        int tens = integer % 10;
        integer /= 10;
        System.out.println(integer);

        int hundreds = integer ;
        System.out.println(integer);

        int sum = hundreds + tens + numberLessThanTen;


        System.out.println("The sum of the digits is " + sum);
    }



    }



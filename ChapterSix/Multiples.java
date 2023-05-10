package ChapterSix;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first  number : ");
        int firstNumber = input.nextInt();

        System.out.println("Enter second number : ");
        int secondNumber = input.nextInt();

        System.out.println(isMultiples(firstNumber,secondNumber));

    }

    public static boolean isMultiples(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber && secondNumber % firstNumber == 0) {
            return true;
        } else {


            return false;
        }
    }
}
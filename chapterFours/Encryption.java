package chapterFours;

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a four digit number or number");
        int userNumber = input.nextInt();
        System.out.println("Encrypted number: " + encrypt(userNumber));
        System.out.println("Decrpyted number:" + decrypt(userNumber));

    }

    public static int encrypt(int number) {
        int digitOne = number / 1000;
        int digitTwo = (number / 100) % 10;
        int digitThree = (number / 10) % 10;
        int digitFour = number % 10;

        digitOne = (digitOne + 7) % 10;
        digitTwo = (digitTwo + 7) % 10;
        digitThree = (digitThree + 7) % 10;
        digitFour = (digitFour + 7) % 10;


        return (digitOne * 1000) + (digitTwo * 100) + (digitThree * 10) + digitFour;
    }

    public static int decrypt(int num) {
        // Splitting the digits
        int digitOne = num / 1000;
        int digitTwo = (num / 100) % 10;
        int digitThree = (num / 10) % 10;
        int digitFour = num % 10;

        // Swapping the digits
        return (digitThree * 1000) + (digitFour * 100) + (digitOne * 10) + digitTwo;
    }


}
































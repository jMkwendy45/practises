package HackerRank;

import java.util.Scanner;

public class IfElseWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();



        if (number % 2 == 1) {    // if n is odd
            System.out.println("Weird");
        } else if (number >= 2 && number <= 5) {    // if n is even and between 2 and 5 (inclusive)
            System.out.println("Not Weird");
        } else if (number>= 6 && number <= 20) {    // if n is even and between 6 and 20 (inclusive)
            System.out.println("Weird");
        } else {    // if n is even and greater than 20
            System.out.println("Not Weird");
        }


        input.close();
    }

}


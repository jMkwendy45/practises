package ChibuzorAssigment;

import java.util.Scanner;

public class StringPalidrome {
    public static void main(String[] args) {

        String rev = "";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String palindrome = input.nextLine();

        int length = palindrome.length();

        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + palindrome.charAt(i);

        if (palindrome.equals(rev))
            System.out.println(palindrome+" is a palindrome");
        else
            System.out.println(palindrome+" is not a palindrome");

    }
    }


package PersonalPractise;

import java.util.Scanner;

public class LoopTrial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("enter a number between 1 and 100");
        int userInput = input.nextInt();

        while (userInput<1 || userInput>10){
            System.out.println("try again"+userInput);
            userInput = input.nextInt();
        }
        System.out.println(userInput+"is between 1 and 10");

    }
}

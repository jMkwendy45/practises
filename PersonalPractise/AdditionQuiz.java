package PersonalPractise;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        // Suppose you want to develop a program to let a first-grader practice addition. The program
        //randomly generates two single-digit integers, number1 and number2, and displays to the student
        //a question such as “What is 1 + 7?,

        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 7 % 10);

        Scanner input = new Scanner(System.in);

        System.out.print(
                "What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();


        while (number1+number2!=answer){
            System.out.println("Wrong answer. Try again. What is "
                    + number1 + " + " + number2 + "? ");
               answer = input.nextInt();

        }

        System.out.println("Very good");


    }
}
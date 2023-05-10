package chapterFours;

import java.util.Scanner;

public class  ValidatingUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10) {
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();
            if (result == 1) {
                passes = passes + 1;

            } else if (result == 2) {
                failures = failures + 1;
            } else {
                System.out.println("invalid input enter one or two");
                continue;
            }
            studentCounter++;
        }
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
         // determine whether more than 8 students passed
        if (passes > 8) {
            System.out.println("Bonus to instructor!");
        }
    }
}
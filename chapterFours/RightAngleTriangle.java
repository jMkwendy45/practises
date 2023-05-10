package chapterFours;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of your triangle");
        int baseTriangle = input.nextInt();

        for (int row = 0; row < baseTriangle; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
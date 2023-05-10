package ChapterFive;

import java.util.Scanner;

public class BarChartPrint {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        for (int i = 0; i <= 3; i++) {
            System.out.println("enter a number");
            int number = input.nextInt();
            printAster(number);
        }
    }

        public static void printAster(int number){

            for (int i = 0; i < number; i++) {
                System.out.print("*\n");

            }

        }
    }




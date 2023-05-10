package ChapterFive;

import java.util.Scanner;

public class FairTax {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.println("How many expenses  categories d you want to enter");
        int categories = input.nextInt();

        double fairTax = 0.3;

        double totalExpenseIs=0;
        for (int i = 1; i <categories ; i++) {
            System.out.println("enter expense in " + i + " and amount spent in each category");
            double expenses = input.nextInt();

            totalExpenseIs += expenses;

            totalExpenseIs *= fairTax;
        }
            System.out.println("your fair tax for all your expenses are"+totalExpenseIs);
        }





    }


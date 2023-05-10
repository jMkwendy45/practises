package chapterFours;

import java.util.Scanner;

public class CreditLimit {
    public static void main(String[] args) {
        int creditLimit;
        int acctNumber;
        double balance;
        int totalCredits;
        double totalItemsCharged;
        Scanner input = new Scanner(System.in);



        do {
            acctNumber = customerAccountNumber(input);
            if (acctNumber == -1) {
                break;
            }
            balance = beginningBalance(input);
            totalItemsCharged = totalItemsCharged(input);
            creditLimit = getCreditLimit(input);
            totalCredits = totalCredits(input);


            double newBalance = calculateNewBalance(balance, totalItemsCharged, totalCredits);
            System.out.println("New balance: " + newBalance);
            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded.");
            }
        } while (true);
    }

    public static int customerAccountNumber(Scanner input) {
        System.out.println("Enter account number (-1 to exit):");
        return input.nextInt();
    }

    public static double beginningBalance(Scanner input) {
        System.out.println("Enter beginning balance:");
        return input.nextDouble();
    }

    public static double totalItemsCharged(Scanner input) {
        System.out.println("Enter total items charged:");
        return input.nextDouble();
    }

    public static int getCreditLimit(Scanner input) {
        System.out.println("Enter credit limit:");
        return input.nextInt();
    }

    public static int totalCredits(Scanner input) {
        System.out.println("Enter total credits:");
        return input.nextInt();
    }

    public static double calculateNewBalance(double balance, double itemsCharged, int totalCredits) {
        return balance + itemsCharged - totalCredits;
    }
}


























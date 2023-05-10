package chapterFours;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter Citizens name ");
            String citizenName = input.nextLine();
            System.out.println("Enter earning for " + i +" "+ "citizen");
            double citizenEarning = input.nextDouble();
            input.nextLine();
            taxCalc(citizenEarning,citizenName);
        }
    }
    public static void taxCalc(double taxEarning,String name) {

        double tax;
        if (taxEarning < 3000) {
            tax = taxEarning * 0.15;
        } else {
            tax = 30000 * 0.15 + (taxEarning - 30000) * 0.20;
        }
        System.out.println(name + "'s total tax: " + tax + " USD");

    }
}
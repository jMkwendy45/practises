package chapterFours;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number items sold: ");
        int count = input.nextInt();

        double totalSales = 0;

        for (int i = 1; i <= count; i++) {
            System.out.printf("Enter the value of item %d: ", i);
            double sale = input.nextDouble();
            totalSales += sale;
            System.out.println("total sale is : "+calculateGrossSale((int) totalSales));
        }

    }

    public static double calculateGrossSale(int grossSales){
        int totalEarning=200;
        double commissionPer = 0.09;
       double commissionSales =  grossSales*commissionPer;
        System.out.println("your commission: "+commissionSales);
        return commissionSales+totalEarning;
    }
}

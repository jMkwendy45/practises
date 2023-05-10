package ChapterFour;

import ChapterFour.SalesCommission;

import java.util.Scanner;

public class SalesCommissionMain {
    public static void main(String[] args) {

        SalesCommission salesCommission = new SalesCommission();
        Scanner input = new Scanner(System.in);
        salesCommission.setSalary(2000);
      double amount=0;
      double totalSales=0.00;
        System.out.println("Enter amount sold or -1 to quit");

        int counter = 0;
      while (amount!= -1) {
          totalSales = totalSales + amount;
          counter = counter + 1;
          System.out.println("enter amount sold or -1 to quit");
           amount = input.nextInt();
      }
         salesCommission.setAmount(totalSales);
        System.out.println(totalSales);

        System.out.println(" Sales person's earning is " +salesCommission.getTotalEarning());








    }





}

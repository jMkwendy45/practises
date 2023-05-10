package ChapterSix;

import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double totalReceipts = 0.0;

    System.out.print("Enter the number of customers: ");
    int numCustomers = input.nextInt();
    for (int i = 1; i <= numCustomers; i++) {
        System.out.printf("Enter the number of hours parked for customer %d: ", i);
        int hours = input.nextInt();

        double charges = calculateCharge(hours);
        totalReceipts += charges;
        System.out.printf("Customer %d's parking charges: $%.2f\n", i, charges);
    }

        System.out.printf("Total receipts for yesterday: $%.2f\n", totalReceipts);
}

    public static double calculateCharge(int hour){
        if (hour<=3)
            return 2.0;
        else if (hour<=24) {

            return 2.00 + 0.50 * (hour - 3);
        } else {
            return 10.00;
        }
    }
}
            

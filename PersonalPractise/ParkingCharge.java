package PersonalPractise;

import java.util.Scanner;

public  class ParkingCharge {

    public static void displayGarageCharge() {
        System.out.println("""
                Welcome
                we charge 3000 for three hours
                we charge 1000 per hour in excess of 3 hours
                we charge 500 for half of the hour
                we charge 24000 for 24 hours""");
    }
    public static int hoursParked() {
        Scanner input = new Scanner(System.in);
        int CustomersHours = 1;
        int total = 0;

        int counter = 0;
        while (CustomersHours != -1) {
            System.out.println("Enter hours parked and -1 to quit");
                CustomersHours = input.nextInt();


//            total = calculateCharges() + CustomersHours;
//            System.out.println(total);
            counter = counter + 1;
        }
        return total;
    }

    public static void calculateCharges() {

        int charges = 0;
        if (hoursParked() <= 3) {
            charges += 3000;
        }
        if (hoursParked() == 24) {
            charges += 24000;
        }
        if (hoursParked() > 3 && hoursParked() < 24) {
            charges += 3000 * 1000;
        }
        System.out.println(charges);
    }

  public static  void  parkingCharges() {

  }



    }


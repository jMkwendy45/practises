package chapterFours;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int miles = milesDriven(input);
        int totalMiles = 0;
        int totalGallons = 0;
        int counter = 0;


        while (miles != -1) {
            int gallons = gallonsUsed(input);
            double gallonsUsed = calculateMilesPerGallon(miles, gallons);
            System.out.println(gallonsUsed);
            totalMiles += miles;
            totalGallons += gallons;
            printCombinedMilesPerGallon(totalMiles, totalGallons, counter);
            miles = milesDriven(input);

            counter++;
        }
    }
    public static int milesDriven(Scanner input) {
        System.out.println(" enter miles driven or -1 to quit");
        return input.nextInt();
    }
    public static int gallonsUsed(Scanner input) {
        System.out.println("enter gallons used or -1 to quit ");
        return input.nextInt();
    }
    public static double calculateMilesPerGallon(int milesDriven, int gallonsUsed) {
        return (double) milesDriven / gallonsUsed;
    }
    public static void printCombinedMilesPerGallon(int totalMiles, int totalGallons, int counter) {
        System.out.printf("Combined miles per gallon for %d trip(s): %.2f%n%n", counter, (double) totalMiles / totalGallons);
    }

}
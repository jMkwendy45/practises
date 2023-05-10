package ChapterSix;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three floating point values seperated by space:");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result = maximum(number1, number2, number3);
        System.out.println("maximum is " + result);

        double result2 = minimum(number1, number2, number3);
        System.out.println("minimum value is " + result2);
    }

    private static double maximum(double x, double y, double z) {
        double maximumValue = x;

        if (y > maximumValue) {
            maximumValue = y;
        }
        if (z > maximumValue) {
            maximumValue = z;
        }
        return maximumValue;
    }

    private static double minimum(double x, double y, double z) {
        double minimumValue = x;

        if (y < minimumValue) {
            minimumValue = y;
        }
        if (z < minimumValue) {
            minimumValue = z;

        }
        return minimumValue;
    }
}





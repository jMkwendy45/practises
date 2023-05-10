package arrayPractices;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        if (args.length == 0) {
            System.out.println("Please provide at least one argument.");
            return;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (String arg : args) {
            int num = Integer.parseInt(arg);
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
    }

}
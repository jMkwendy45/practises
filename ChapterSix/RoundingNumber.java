package ChapterSix;

import java.util.Scanner;

public class RoundingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("enter number");
            double number = input.nextDouble();
            double rounded = Math.floor(number + 0.5);
            System.out.println("original number\n"+number+"\nrounded number\n"+rounded);
        }
    }
}

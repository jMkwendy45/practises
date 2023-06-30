package loopPractise;

import java.util.Scanner;

public class Pixle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] pixles = new int[4];


        for (int i = 0; i < pixles.length; i++) {
            System.out.println("Enter a a number");
            int number = scanner.nextInt();
            pixles[i] = number;
            System.out.println(pixles[i]);

        }

        for (int i = 0; i < pixles.length; i++) {
            if (pixles[i] <= 20) {
                pixles[i] = 10;
            }
            else if (pixles[i] <= 40) {
                pixles[i] = 30;
            }
            else if (pixles[i] <= 60) {
                pixles[i] = 50;
            }
            else if (pixles[i] <= 80) {
                pixles[i] = 70;
            }
            else if (pixles[i] <= 100) {
                pixles[i] = 90;
            }
           else  if (pixles[i] <= 120) {
                pixles[i] = 110;
            }
           else  if (pixles[i] <= 140) {
                pixles[i] = 130;
            }
           else  if (pixles[i] <= 160) {
                pixles[i] = 150;
            }
           else  if (pixles[i] <= 180) {
                pixles[i] = 170;
            }
        }


        for (int i = 0; i < pixles.length ; i++) {
            System.out.println("new"+pixles[i]);

        }
    }
}
package loopPractise;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[4];


        for (int i = 0; i < 4; i++) {
            array[i] = -1;
        }
        System.out.println("Array with the -1 element"+Arrays.toString(array));


        for (int i = 0; i < array.length; i++) {
            System.out.println("enter a number between 10-100");
            int number = input.nextInt();
            array[i] = number;
        }
        System.out.println("the number input" + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[i] = -1;
                    break;
                }

            }

        }

        for (int i = 0; i < array.length ; i++) {
            if (array[i]!=-1){
                System.out.println("the new Array"+array[i]);
            }

        }
    }
}
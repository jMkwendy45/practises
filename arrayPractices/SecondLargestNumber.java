package arrayPractices;

import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[]number = {22,23,35,798,76,90,70,56};
        System.out.println(Arrays.toString(findSecondLarges(number)));
    }
    public static int[] findSecondLarges(int[]number) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i <number.length ; i++) {
            if (number[i]>largest) {
                secondLargest = largest;
                largest = number[i];
            } else if (number[i] > secondLargest && number[i] != largest) {
                secondLargest =number[i];
            }

        }
        return new int[]{secondLargest};
    }
   }

package arrayPractices;

import java.util.Arrays;
public class LargestNumber {
    public static void main(String[] args) {
        int[] number = {22, 23, 35, 798, 76, 90, 70, 56};
        System.out.println(Arrays.toString(findLargest(number)));
    }

    public static int[] findLargest(int[] number) {
        int largest = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {
                largest = number[i];
            }
        }
        return new int[]{largest};
    }

}


package arrayPractices;

import java.util.Arrays;

public class Lowest {
    public static void main(String[] args) {
        int[] array = {2,6,1, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(lowestArray(array)));
    }

    public static int [] lowestArray(int[] number) {
        int lowest = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] < lowest) {
                lowest = number[i];
            }
        }

         return new int[]{lowest};
    }
}


package arrayPractices;

import java.util.Arrays;

public class SortNumber {
    public static void main(String[] args) {
        int[]array = {10,9,8,2,1,7};
        System.out.println(Arrays.toString(ascendingOrder(array)));

    }

    public  static  int[] ascendingOrder(int[] number) {
        int counter = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] > number[j]) {
                    counter = number[i];
                    number[i] = number[j];
                    number[j] = counter;

                }
            }
        }
        return number;
    }


}

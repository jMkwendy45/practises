package arrayPractices;

import java.util.Arrays;

public class ArrayReverseSwap {
    public static void main(String[] args) {
        int[]array ={1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(array)));
    }

    public static int[] reverseArray(int[] number) {

        for (int index = 0; index < number.length; index++) {
            for (int swap = 0; swap < number.length - index - 1; swap++) {
                int newNumber = number[swap + 1];
                System.out.println(newNumber);
                int empty = number[swap];
                number[swap] = newNumber;
                System.out.println( number[swap]);
                number[swap+1] = empty;

//
            }
        }
        return number;
    }
}
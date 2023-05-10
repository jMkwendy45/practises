package arrayPractices;

import java.util.Arrays;

public class MultiplyArray {
    public static void main(String[] args) {
        int[] array = {2, 4, 3, 1, 8, 3};
//        System.out.println(Arrays.toString(multiply(array)));
        System.out.println(Arrays.toString(swap(array)));

    }

    public static int[] multiply(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
        return array;

    }

    public static int[] swap(int []list) {

        for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
            // Swap list[i] with list[j]
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
        return list;
    }
}

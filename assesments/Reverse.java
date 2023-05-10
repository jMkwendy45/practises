package assesments;

import java.util.ArrayList;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {

        int[] arr = new int[]{12, 3, 6, 20};
        List<Integer> digit= new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
            digit.add(arr[i]);
        }
        System.out.println(digit);

    }
}


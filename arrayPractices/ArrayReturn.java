package arrayPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayReturn {
    public static void main(String[] args) {
         int[]array = {2,18,14,28,35,67,89,90};
        System.out.println(returnArrayIndex(array));
    }

    public static  List<Integer> returnArrayIndex(int[]array){
        List<Integer> arrayNumberAtEvenOdd = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2!=0){
                arrayNumberAtEvenOdd.add(array[i]);
            }

        }
        return arrayNumberAtEvenOdd;
    }

}
package arrayPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};


        ArrayList<Integer> temp = new ArrayList<>();
        for (int index = array.length-1; index >=0; index--) {
            temp.add(array[index]);
        }
//        int[] newArray = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            array[i] = temp.get(i);
        }

        System.out.println(Arrays.toString(array));
    }





}

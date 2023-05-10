package arrayPractices;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[]number = {1,9,8,7,0,6,56,};
        System.out.println(Arrays.toString(findSecondLargest(number)));

    }
    public static  int[] findSecondLargest(int[]number){
        Arrays.sort(number);

     return new int[]{number[number.length - 2]};
    }
}

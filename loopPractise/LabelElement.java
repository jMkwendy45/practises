package loopPractise;

import java.util.Arrays;

public class LabelElement {
    public static void main(String[] args) {




    int[][] arr = new int[5][6];

        for (int col = 0; col <6 ; col++) {

            for (int row = 0; row <5; row++) {
                arr[row][col]=0;
            }
            
        }

        System.out.println(Arrays.deepToString(arr));


    }
}

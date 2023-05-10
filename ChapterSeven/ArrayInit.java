package ChapterSeven;

import java.util.Arrays;

public class ArrayInit {
    public static void main(String[] args) {

        int [] array = {32,27,64,18,95,14,90,70,60,37};
        System.out.printf("%s%8s%n","index","value");
        for (int counter = 0; counter < array.length; counter++) {
            // to change array index o to 8
            array[0] = 8;
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }

            
        }
        

    }





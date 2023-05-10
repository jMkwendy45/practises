package ChapterSeven;

import java.util.Arrays;
// populate array1-10
// using for loops
// print out the content using a for loop
public class JavaNed {
    public static void main(String[] args) {
        int[]array= new int[10];
//        int counter =1;
        for (int i = 0; i < array.length; i++) {
//            System.out.println("["+array[i]+"]");
//            array[i] = counter;
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
        }
    }


package arrayPractices;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[]array ={2,2,3,4,1,1,12,4};
        int newArray = array.length;

        newArray = removeDuplicates(array, newArray);

        // Print the array elements
        for (int i = 0; i < newArray; i++) {
            System.out.print(array[i] + " ");
        }

    }
    public static int removeDuplicates(int[] array, int number) {
//        // Return early if there are no or only one element
//        if (n <= 1) {
//            return n;
//        }
        // Create an array to store unique elements
        int[] uniqueArr = new int[number];
        int uniqueCount = 0;
        // Iterate through the input array and store unique elements in uniqueArr
        for (int i = 0; i < number - 1; i++) {
            if (array[i] != array[i + 1]) {
                uniqueArr[uniqueCount++] = array[i];
            }
        }
        uniqueArr[uniqueCount++] = array[number - 1];

        // Overwrite the original array with the unique elements
        for (int i = 0; i < uniqueCount; i++) {
            array[i] = uniqueArr[i];
        }

        return uniqueCount;
    }



    }

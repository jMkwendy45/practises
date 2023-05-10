package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Polling {
    private String[] causes;
    private int[][] summarize = new int[5][10];

    public Polling(String[] causes) {
        this.causes = causes;

    }

    public void ReceiveResponse() {
        for (int rate = 0; rate < summarize[0].length; rate++) {
            System.out.printf("Rating %2d", rate + 1);
        }
        System.out.println("Average");


        for (int cause = 0; cause < summarize.length; cause++) {
            System.out.printf("rate %2d", cause + 1);

            for (int rate : summarize[cause]) {
                System.out.printf("%9d", rate + 1);
            }

        }
    }


}
class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] array2 ={{4,5,6,7,8},{ 5,6,4,6,7}};
        addArrays(array2);

        int[][] array = new int[2][2];
        printArray(array);
        for (int counter = 0; counter < array.length; counter++) {
            for (int counter2 = 0; counter2 < array[counter].length; counter2++) {
                System.out.println("Enter array value");
                array[counter][counter2] = scanner.nextInt();
            }
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
        public static void printArray(int[][]array) {

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.println(array[i][j]);


                }
            }
        }
         public static void addArrays(int[][]arrays){
            int total = 0;
             for (int i = 0; i < arrays.length; i++) {
                 for (int j = 0; j <arrays[i].length ; j++) {

                     total = total+ arrays[i][j];

                 }
                 System.out.println(total);
             }


        }



    }

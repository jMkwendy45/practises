package arrayPractices;

import java.util.Scanner;

public class Polling {
    public static void main(String[] args) {
         Scanner  input  = new Scanner(System.in);
        int[][]responses = new int[5][10];
        int rate = 0;
        int count = 0;
        while (rate !=-1){


//            rateCause(input);
            for (int row = 0; row < responses.length; row++){
                System.out.println("rate each cause from 1-10");
                rate = input.nextInt();
                for (int column = 0; column <responses[row].length; column++){
                    responses[row][column] = rate;

                }

            }
            count++;
        }

        getResponses(responses);
    }


    public static  void causes(){
        String [] cause = {"political","social","agriculture","environmental","climate"};

    }
    public  static int rateCause(Scanner input){

        System.out.println("rate each cause from 1-10");

        return input.nextInt();
    }

    public static void getResponses(int [][] responses){
        for (int row = 0; row < responses.length; row++){
            for (int column = 0; column <responses[row].length; column++){
                System.out.println( responses[row][column]);

            }
        }

    }

}

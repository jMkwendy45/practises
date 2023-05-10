package HackerRank;

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {

        }
    public static  int largest(int number){

        int largest = 0;
        for ( number = 0; number<=10 ; number++) {
            if (number>largest){
                largest=number;
            }
        }
        return largest;
    }
    public static  int small(int number){
        int smallest = 0;
        for (int i = 0; i <=10 ; i++) {
            if (i>smallest){
                smallest=i;
            }
        }
     return  smallest;

    }
}

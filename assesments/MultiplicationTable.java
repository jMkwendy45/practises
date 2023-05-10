package assesments;

import java.util.Scanner;

public class MultiplicationTable {
    public static void displayMultiplication(int numbers){
        for (int i = 1; i <= 12; i++) {
            System.out.println(numbers +"  *  " + i+ "  =  "+numbers*i);

        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int numbers = input.nextInt();
        displayMultiplication(numbers);


    }
}

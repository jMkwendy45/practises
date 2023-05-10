package ChapterSix;

import java.util.Scanner;

public class displayNumberOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter");
        int side = input.nextInt();
        astericksRow(side);

    }
    public static void astericksRow(int side){
        for (int i = 0; i <=side ; i++) {
            astericksColum(side);

        }


    }

    public  static void astericksColum(int side){
        for (int i = 0; i <side ; i++){
            System.out.print(" * ");
        }
        System.out.println(" ");
    }
}

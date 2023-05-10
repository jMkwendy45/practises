package ChapterSix;

import java.util.Scanner;

public class displaySquareOfAnyCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter");
        int side2 = input.nextInt();

        System.out.println("Enter char ");
        char print = input.next().charAt(0);
        astericksRow(side2,print);
    }



    public static void astericksRow(int side,char print){
        for (int i = 0; i <= side; i++) {
            astericksColum(print);

        }


    }

    public  static void astericksColum(char print){
        for (int i = 0; i < print ; i++){
            System.out.print(print);
        }
        System.out.println(" ");
    }
}

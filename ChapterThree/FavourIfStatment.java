package ChapterThree;

import java.util.Scanner;

public class FavourIfStatment {
    public static void main(String[] args) {
        int total = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first Number");
        int firstNumber = input.nextInt();
        System.out.println("Enter Second Number");
        int secondNumber = input.nextInt();

        total = firstNumber + secondNumber;
        if (total == 5){
            System.out.println("five");
        } else if (total == 10) {
            System.out.println("ten");

        }else{
            System.out.println("you are a mumu man");
        }


    }
}

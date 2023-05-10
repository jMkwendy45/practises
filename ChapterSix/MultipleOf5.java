package ChapterSix;

import java.util.Scanner;
// if number is divisible by 5 use remainder %
public class MultipleOf5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number= input.nextInt();

        if (number%5==0) {
            System.out.println("multiple of 5");
        }
        if (number%5!=0){
            System.out.println("number is not a multiple of 5");
        }





    }


}

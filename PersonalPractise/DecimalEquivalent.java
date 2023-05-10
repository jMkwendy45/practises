package PersonalPractise;

import java.util.Scanner;

public class DecimalEquivalent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary integer,that has 0's and 1's ");
        int number = input.nextInt();
        System.out.println(multiplyBYTwo(number));}

    public static int divideNumber(int number) {
        int divided = 0;
        int divisor = 1;
        for (int index = 1; index <Math.log10(number)+1; index ++) {
            divided = number/divisor%10;
            divisor *=10;
        }
        return divided;
    }
    public static int multiplyBYTwo(int number) {
        int multiply;
        int counter =1;
        int sum =0;
        for (int i = 1; i <= Math.log10(number); i++) {
            multiply = divideNumber(number) * counter;
            counter*=2;
             sum+=multiply;
        }
        return sum;

    }
//    public  static  int sumUp(int number){
//        int sum = 0;
//        for (int i = 0; i <number ; i++) {
//           sum+= multiplyBYTwo(number);
//        }
//        return sum;
//    }
}










package PersonalPractise;

import java.util.Scanner;

public class NonNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a non negative number");
        int  sum=1;


        int res = 1, i;
        for (i=2; i<=input.nextInt(); i++)
            res *= i;

      //  for (int num = input.nextInt();
           //  num > 0; num--) {

           // int factorial = num * num;

         //   sum = factorial + factorial;
//
            System.out.print(res);

        }
        }




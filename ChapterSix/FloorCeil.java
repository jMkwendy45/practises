package ChapterSix;

import java.util.Scanner;

public class FloorCeil {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("enter a number");
        double num = input.nextInt();

        System.out.println("the largest is"+myFloor(num));
        System.out.println("the smallest is"+myCeil(num));

    }
    public static int myFloor(double num){
        int x = Integer.MIN_VALUE;
        if( num>x){
            x = (int) num;
        }
        return  x;
    }
    public static int myCeil(double num){
        int x = Integer.MAX_VALUE;
        if( num<x){
            x = (int) num;
        }
        return  x;
    }

    }


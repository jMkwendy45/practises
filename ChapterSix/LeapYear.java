package ChapterSix;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = input.nextInt();
        System.out.println(isLeapYear(year));

    }
    public  static  boolean isLeapYear(int year){
        if  (year % 4 == 0 && year % 100 !=0  || year % 400 == 0){
            System.out.println("number is a leap year");
            return  true;
        }
      return  false;

    }













}

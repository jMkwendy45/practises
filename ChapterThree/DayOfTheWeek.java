package ChapterThree;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a valid number from 1-5 to select days of the week");
        int response = input.nextInt();
         int responses = response%7;
        DaysOfTheWeek(responses);
    }
    private  static  void  DaysOfTheWeek(int daysOfTheWeek){

        switch (daysOfTheWeek){
            case  1:
                System.out.println("Sunday");
                break;
            case  2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuseday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("please choose a valid");
        }

    }
}

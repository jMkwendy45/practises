package PersonalPractise;

import java.util.Scanner;

public class SevenDays {


    public void days(){
        Scanner input = new Scanner(System.in);
        String userInput;
        do{
            System.out.println("what day of the week is today?");
            int day = input.nextInt();

            switch (day){
                case 1: sunday();
                    break;
                case 2: monday();
                    break;
                case 3: tuesday();

            }
            System.out.println("Want to continue? Enter Yes.");
            userInput = input.next();
        } while(userInput.equalsIgnoreCase("Yes"));

    }
    public void sunday() {
        System.out.println("Today is Sunday");
    }
    public void monday() {
        System.out.println("Today is Monday");
    }
    public void tuesday() {
        System.out.println("Today is Tuesday");
    }

}

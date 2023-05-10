package Nokia;

import java.util.Scanner;

public class SamsungMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Samsung samsung110 = new Samsung();
        samsung110.displayMenu();
        System.out.println("enter a number to select from the main menu");
        samsung110.usersChoice();








//        String userChoice= input.next();
//        while (userChoice.equalsIgnoreCase("yes")) {
//            samsung110.displayMenu();
//            System.out.println("do you wish to continue");
//            samsung110.usersChoice();
//        }
        String userChoice;
        do {
           System.out.println("do you wish to continue yes/no");
            userChoice = input.next();
           if (userChoice.equalsIgnoreCase("yes")) {
                samsung110.displayMenu();
                samsung110.usersChoice();
            }
            if (!userChoice.equalsIgnoreCase("no")) System.out.println("enter yes or no");
            samsung110.displayMenu();
            samsung110.usersChoice();
          System.out.println("do you wish to continue yes/no");
           userChoice = input.next();
        }
       while (userChoice.equalsIgnoreCase("yes"));
      System.out.println("See you next time!");


    }
}
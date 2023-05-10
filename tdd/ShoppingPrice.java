package tdd;

import java.util.Scanner;

public class ShoppingPrice {
    private final double bookPrice = 200;
    private final double Shoe = 500;
    private final double Bag  =  300;
    private Scanner scanner = new Scanner(System.in);
    public String displayMainMenu() {

        String message = "Welcome to Topaz Supermarket\n To check book price press 1\n To check bag price2\n To check bag press 3\n";
    return message;
    }

    public double choice(int input) {
         if( input == 1){
             System.out.println("how many books");
             System.out.println(calculateBookPrice());
             System.out.println("Press 1 to return to main menu or any number to exit");
             return calculateBookPrice();
         }
         else if (input==2) {
             System.out.println("how many shoes");
             System.out.println(calculateShoePrice());
             System.out.println("Press 1 to return to main menu or any number to exit");

             return calculateShoePrice();
         }
         else if (input==3){
             System.out.println("how many bags");
             System.out.println(calculateBagPrice());
             System.out.println("Press 1 to return to main menu or any number to exit");
             return calculateBagPrice();
         }
         else{
             return 0;
         }

    }

    double calculateBagPrice() {
        int input= scanner.nextInt();
        return input*Bag;
    }

    double calculateShoePrice() {
        int input= scanner.nextInt();
        return input*Shoe;
    }

    public double calculateBookPrice() {
      int input= scanner.nextInt();
     return input*bookPrice;
    }
}

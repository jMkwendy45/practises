package tdd;

import java.util.Scanner;

public class ShoppingPriceMain {
    public static void main(String[] args) {
        ShoppingPrice shoppingPrice = new ShoppingPrice();

        System.out.println(shoppingPrice.displayMainMenu());
        Scanner scanner = new Scanner(System.in);
        for (int counter = 1; counter <4; counter++) {
            shoppingPrice.choice(scanner.nextInt());
            int input = scanner.nextInt();
            if (input == 1){
                System.out.println(shoppingPrice.displayMainMenu());
                shoppingPrice.choice(scanner.nextInt());
            }
            else {
                break;
            }

        }
    }
    }

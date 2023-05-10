package ChapterSix;

import java.util.Scanner;

public class ConvertCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter celsius degree in decimal");
        double celsius = input.nextDouble();

        double fahrenheit = (9.0 / 5) * celsius + 32;
        
        System.out.println(" " + celsius+ " is"+fahrenheit);

    }
}

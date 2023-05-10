package ChapterSix;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number you want to convert ");
        double  number = input.nextInt();
        System.out.println("the kelvin equivalent is "+kelvinMethod(number));
        System.out.println("the celsius equivalent is "+celsiusMethod(number));

    }
    public  static double kelvinMethod(double celsius){


        return  (celsius +273.15);
    }
    public  static double celsiusMethod(double kelvin){


        return  (kelvin-273.15);
    }

}

package ChapterFive;

import java.util.Scanner;

public class BarChartPrinting {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);



                System.out.print("Enter a number between 1 and 30: ");
               int number1 = input.nextInt();

                System.out.print("Enter a number between 1 and 30: ");
               int number2 = input.nextInt();

                System.out.print("Enter a number between 1 and 30: ");
              int  number3 = input.nextInt();

                System.out.print("Enter a number between 1 and 30: ");
               int number4 = input.nextInt();

                System.out.print("Enter a number between 1 and 30: ");
              int  number5 = input.nextInt();


                System.out.println("Number 1: " + repeatAsterisk(number1));
                System.out.println("Number 2: " + repeatAsterisk(number2));
                System.out.println("Number 3: " + repeatAsterisk(number3));
                System.out.println("Number 4: " + repeatAsterisk(number4));
                System.out.println("Number 5: " + repeatAsterisk(number5));
            }
            public static String repeatAsterisk(int number) {
                String asterisk= "";
                for (int i = 0; i < number; i++) {
                    asterisk += "*";
                }
                return asterisk;
            }
        }



package HackerRank;

import java.io.IOException;
import java.util.Scanner;

public class Sample1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a 4-Digit number");
        String number = input.next();
        for (int index = 0; index < number.length(); index++) {
            try {
                validateNumber(number, index);
            } catch (Throwable exception) {
                System.err.println(exception);
            }
            System.out.println(number);

        }
    }
            private static  void validateNumber(String number,int index)throws IOException{
                if(number.charAt(index)<48||number.charAt(index)>57)
                    throw new IOException("have sense");
            }

}

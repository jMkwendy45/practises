package PersonalPractise;

import java.util.Scanner;

public class ClassPseudo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;
        System.out.println("enter grade 0r -1 to quit");
        int grade = input.nextInt();

        int counter = 0;
        while (grade!=-1){
            total += grade;
            counter=counter+1;
            System.out.println("enter grade or -1 to quit");
            grade = input.nextInt();

        }

        System.out.println("the total is"+total);
          if ( counter!=0){
            double average =  (double)total/counter;
            System.out.println("the average is "+average);
        }
        else {
            System.out.println("no grades were entered");
        }


    }



}

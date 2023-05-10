package ChapterSeven;

import java.util.Scanner;

public class ClassPractise {
    int[] array = new int[5];
    int sum;
    Scanner input = new Scanner(System.in);


    public void CollectUserInput() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter a number");
            array[i] = input.nextInt();
        }
    }
        public int addSumCalculateAverage(){
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return sum/ array.length;

        }

       public  void loop(){
           System.out.println("do you want find average");
           String answer = input.nextLine();

           while (answer.equalsIgnoreCase("yes")){
               CollectUserInput();
               System.out.println("the average is"+addSumCalculateAverage());
               System.out.println("do you want to find average");
               answer=input.next();
           }



    }
}

package ChapterFive;

public class DivisibleSum {
    public static void main(String[] args) {

         int sum = 0;
       for (int number=1;  number<=30; number++) {
           if (number % 3 == 0) {

               System.out.println(number);
               sum += number;
           }
       }
        System.out.printf("\n\nThe sum : %d \n",sum);
       }









    }




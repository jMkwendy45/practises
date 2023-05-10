package PersonalPractise;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
       // int array[];
        int[]array2;
        double[]array3=new double[7];


        Scanner input = new  Scanner(System.in);
        int[]eme=new int[]{12,7777777,90,70,200,79,60};
        System.out.println(eme[6]);
        int sum= eme[0]+eme[5];
        System.out.println(sum);
        System.out.println("Enter an array");
        int eme2 = input.nextInt();
        eme[1]=eme2;
        System.out.println(eme[1]);
        int total=0;
      for (int index=0;index<=eme.length;index++) {
          total = total + eme[index];

      }

        //  System.out.println(total);



    }


}

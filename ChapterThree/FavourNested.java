package ChapterThree;

import java.util.Objects;
import java.util.Scanner;

public class FavourNested {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Are you a native");
        String nativeRespond = input.next();

        System.out.println("are you in cohort 15");
        String cohortRespond = input.next();

       String responds = "Yes";

       if (Objects.equals(nativeRespond, responds))
           System.out.println("you are a native");
       if (Objects.equals(cohortRespond, responds)){
               System.out.println("you are entitled to a food");
           } else {
               System.out.println("you are a thief");

           }
       }



    }


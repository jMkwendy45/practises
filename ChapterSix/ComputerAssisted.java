package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssisted {
  static   int  numberOne =0;
   static int numberTwo =0;
   static int answer;
   static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

           generateQuestion();

           answer = input.nextInt();
        while (numberOne * numberTwo != answer) {
            System.out.println("No please try again"
                    + numberOne + " * " + numberTwo + "? ");
            answer = input.nextInt();
            AnswerIncorrect();
        }
        System.out.println("Very good");
          generateQuestion();
        answer = input.nextInt();
        AnswerResponse();
         // answer++;
    }
    public  static  void generateQuestion(){
        SecureRandom secureRandom = new SecureRandom();
         numberOne = 1 + secureRandom.nextInt(9);
         numberTwo = 1 + secureRandom.nextInt(9);
        System.out.print("What is " + numberOne + " " + "* " + numberTwo + "? ");


    }
    public  static  void AnswerResponse() {
        SecureRandom secureRandom = new SecureRandom();
        int numbergen = 1 + secureRandom.nextInt(4);
        switch (numbergen) {

            case 1:
                System.out.println("""
                        Very good!
                         """);
                break;
            case 2:
                System.out.println("""
                                              
                        Excellent!
                         """);
                break;
            case 3:
                System.out.println("""
                        Nice work!
                        """);
                break;
            case 4:
                System.out.println("""
                        Keep up the good work!""");
                break;
            default:
                System.out.println("Bravo,you are promoted");
        }
    }
        public static  void AnswerIncorrect() {
            SecureRandom secureRandom = new SecureRandom();
            int numberinc = 1 + secureRandom.nextInt(4);

            switch (numberinc){
                case 1:
                    System.out.println("""
                        No please try again!
                         """);
                    break;
                case 2:
                    System.out.println("""
                                              
                        Wrong try once more!
                         """);
                    break;
                case 3:
                    System.out.println("""
                        Dont give up
                        """);
                    break;
                case 4:
                    System.out.println("""
                        No keep  trying!""");
                    break;
                default:
                    System.out.println("go back to primary school");
        }
    }
}
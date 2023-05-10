package PersonalPractise;


import java.util.Scanner;

public class GlobalWarming {
    public static String question1 = "What is the global warming controversy about?\": {" +
            "          1: the public debate over whether global warming is occurring" +
            "          2: how much global warming has occurred in modern times" +
            "          3: \"what global warming has caused" +
            "          4:   all of the above";

    static int correctAnswer = 2;

   public static String question2 = """
            "What movie was used to publicize the    controversial issue of global warming?": {
                   "1": "the bitter truth",
                   "2": "destruction of mankind",
                   "3": "the inconvenient truth",
                   "4": "the depletion"
               },""".indent(1);
   static int correctAnswer2 = 2;

  public   static String question3 = """
            In what year did former Vice President Al Gore and a U.N. network of
                                         scientists share the Nobel Peace Prize?": {
                                                "1": "1996",
                                                "2": "1998",
                                                "3": "2003",
                                                "4": "2007\\""\"\"""";

   static int CorrectAnswer3 = 1;


    public static String question4 = """
            "Many European countries took action to reduce greenhouse gas before what year?": {
                   "1": "1985",
                   "2": "1990",
                   "3": "1759",
                   "4": "2000\"""".indent(1);

 static    int correctAnswer4 = 4;


   public static String question5 = """
            "Who first proposed the theory that increases in greenhouse gas would lead to an increase in temperature?": {
                   "1": "Svante Arrhenius",
                   "2": "Niccolo Machiavelli",
                   "3": "Jared Bay less",
                   "4": "Jacob Thornton\"""".indent(1);

  static   int correctAnswer5 = 3;


    public static void main(String[] args) {
        ShowQuestion();



    }

    public static void ShowQuestion() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                System.out.println(question1);
                if( answers()==correctAnswer);
                System.out.println(1);
            } else if (i == 2) {
                System.out.println(question2);
              if  (answers()==correctAnswer2);
               System.out.println(2);
            } else if (i == 3) {
                System.out.println(question3);
                answers();
            } else if (1 == 4) {
                System.out.println(question4);
                answers();
            } else {
                System.out.println(question5);
                answers();

            }
        }
    }

    public static int answers() {

        Scanner input = new Scanner(System.in);
        System.out.println("enter correct answer");


        return input.nextInt();
    }
}
package Nokia;

import java.util.Scanner;

public class Samsung {

    public void displayMenu(){
        System.out.println("""
                welcome
                MAIN MENU
                1 phone book
                2  chart
                3. call register
                4. tones
                5.message menu
                6.settings""");

    }
    public void phoneBookMenu(){
        System.out.println("""
               PHONE BOOK
               search
               service call
               Add name
               edit
               Options
               continue
               """);


    }
    public  void messageMenu(){
        System.out.println("""
                create message
                inbox
                outbox
                 picture message
                templates
                 simleys""");
    }
    public void chartMenu(){
        System.out.println("""
                1.chart""");
    }
    public  void callRegisterMenu(){
        System.out.println("""
                1. missed calls
                2.  received calls
                3. dialled calls
                4. erase recent calls lists
                5. show call duration""");
    }
    public  void tonesMenu(){
        System.out.println("""
                ringing tone
                ringing volume
                 incoming call alert
                composer
                 message alert tone
                keypad tone
                """);
    }
    public  void setting() {
        System.out.println("""
                SETTINGS
                Call settings
                phone settings
                Security settings
                go back to main menu
                """);
    }
    public void usersChoice(){
        Scanner input = new Scanner(System.in);
        int userInput =input.nextInt();
        switch (userInput){
            case 1:
                phoneBookMenu();
                break;
            case 2:
                chartMenu();
                break;
            case 3:
                callRegisterMenu();
                break;
            case 4:
             tonesMenu();
             break;
            case 5:
                messageMenu();
                break;
            case 6:
                setting();
                break;



        }

    }
}

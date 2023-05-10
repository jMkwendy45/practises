package Nokia;

import java.util.Scanner;

public class Nokia {

    Scanner input = new Scanner(System.in);
    private int userInput;

    public void mainMenu(){
        System.out.println("""
                WELCOME
                MAIN MENU
                1 phonebook
                2 Messages
                3 chat
                4 Call Register
                5  Settings
                6.exist
                """);

            System.out.println("enter a number to select from the main menu");
            userInput = input.nextInt();
            switch (userInput) {
                case 1 -> phoneBook();
                case 2 -> message();
                case 3 -> chat();
                case 4 -> callRegister();
                case 5 -> settings();
                case 6 -> System.out.println("invalid number/exist");
            }

        }



   public void phoneBook(){
       System.out.println("""
               PHONE BOOK
               1 search
               2. service call
               3.Add name
               4 edit
               5 Options
               6.continue
               7.return back to main menu
               """);
       System.out.println("to select form the phonebook menu enter a number");
       userInput=input.nextInt();
         if(userInput==1){
             System.out.println("search");
         }
         if (userInput==2){
             System.out.println("service call");
         }
         if(userInput==3){
             System.out.println("add name");
         }
         if (userInput==4){
             System.out.println("edit");
         }
         if (userInput==5){
             displayOptions();
         }
         if (userInput==7) {
             mainMenu();
         }
   }
   public void displayOptions(){
       System.out.println("""
               OPTIONS
               1.type of view
               2.memory status
               3.return to phonebook
               4.return to main menu
               5.exist""");
       userInput= input.nextInt();
       switch (userInput) {
           case 3 -> phoneBook();
           case 4 -> mainMenu();
           case 5-> System.out.println("invalid number/thank you !!!");
       }
    }
    public  void message(){
        System.out.println("""
                MESSAGE
                1. write message
                2. inbox
                3.outbox
                4. picture message
                5.templates
                6.message settings
                7. return to main menu
                8.return to message
                9. exist""");
        System.out.println("if you select 6 it takes you to message settings");
            userInput= input.nextInt();
           switch (userInput){
               case 6:
                   messageSettings();
                   break;
               case 7:
                   mainMenu();
                break;
               case 8:message();
               break;
               case 9:
               default:
                   System.out.println("invalid number thank you");
           }

    }
     public void messageSettings(){
         System.out.println("""
                 MESSAGE SETTINGS
                 1message centre number
                 2.message sent as
                 3.message validity
                 4.return to message menu
                 5.return to main menu
                 6.exist""");
         userInput=input.nextInt();
         switch (userInput){
             case 4:
              message();
              break;
             case 5:
                 mainMenu();
              break;
             case 6:
             default:
                 System.out.println("thank you invalid number");

         }


     }
     public void chat(){
         System.out.println("""
                 CHAT
                 1.chat
                 2.go back to main menu
                 """);
         userInput= input.nextInt();
         if (userInput==2){
             mainMenu();
         }
         else {
             System.exit(0);
         }
     }
     public  void callRegister(){
         System.out.println("""
                 CALL REGISTER
                 1. missed calls
                 2.dialled calls
                 3.erase recent calls
                 4.show call duration
                 5.go back to main menu
                 6.exist
                 """);
         userInput= input.nextInt();
         while (userInput==6){
             mainMenu();
             }

     }
     public void  settings( ){
         System.out.println("""
                 SETTINGS
                 1.Call settings
                 2.phone settings
                 3.Security settings
                 4.go back to main menu
                 5.exist""");
         System.out.println("option only available for call settings press 1");
              userInput= input.nextInt();
              if (userInput==1){
                  callSettings();
              } else if (userInput==4) {
                  mainMenu();
              }
              else {
                  System.exit(0);
              }

     }
     public  void callSettings(){
         System.out.println("""
                 CALL SETTINGS
                 1.automatic redial
                 2.speed dialling
                 3.call waiting options
                 4.Own number sending
                 5.phone line in use
                 6.return back to call settings
                 7.return back to main menu
                 8.exist""");
         userInput=input.nextInt();
         if (userInput==6){
             callSettings();
         } else if (userInput==7) {
             mainMenu();
         }
         else {
             System.exit(0);
         }
         }
     }



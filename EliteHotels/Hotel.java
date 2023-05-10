package EliteHotels;

import PersonalPractise.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Hotel {

    private String[] rooms;

    public Hotel(int numberOfRooms) {
        this.rooms = new String[numberOfRooms];
    }

    public String bookRoom(String user) {
            Scanner input = new Scanner(System.in);
         System.out.println("please book a room");
         String userInput = input.nextLine();

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                rooms[i] = userInput;
                break;
            }
        }

                for (int i = 0; i < rooms.length; i++) {
                    if (rooms[i] == null) {
                        rooms[i] = userInput;
                        break;
                    }
                }
                return "Room successfully booked";
            }

    public boolean checkOut(int roomNumber) {
        boolean hasCheckOut; //false;
        if (rooms[roomNumber - 1] != null) {
            rooms[roomNumber - 1] = null;
        }
        rooms[roomNumber] = null;
        hasCheckOut = true;
        return hasCheckOut;

    }

    public int getRooms() {
        return rooms.length;
    }

    public int bookedRooms() {
        int filledRooms = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                filledRooms++;
            }
        }
        return filledRooms;
    }

    public int getAvailableRooms() {
        int emptyRooms = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                emptyRooms++;

            }
        }
        return emptyRooms;
    }

    public String getRoomGuest(int user) {

        return rooms[user];
    }

    public String getRoomGuests() {
        String[] allGuest = new String[bookedRooms()];
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                allGuest[i] = rooms[i];
            }
        }
        return Arrays.toString(allGuest);
    }
    public void displayMenu() {
        System.out.println("""
                Welcome to GLOBAL CITY HOTELS
                PLEASE ENTER STAFF PIN
                PRESS
                7.to enter staff pin
                1. to book room
                2.checkout
                3.get rooms
                4.get available rooms
                5.getROOm guest
                6.getRoom Guests
                8.MainMenu
                 """);
    }
    public  void setPin(){
        Scanner input  = new Scanner(System.in);
        System.out.println("please enter company's pin or 7 to return to main menu");
        int number;
        int pin=8888;
        for (number = 0; number<5 ; number++) {

            number=input.nextInt();
        }
        if (number == pin) {
            System.out.println(" YOU SUCCESSFULLY LOGGED IN");
        }
        if (number!=pin) {
            System.out.println("WRONG PIN ,YOU HAVE ONE MORE CHANCE");
        }
        if (number==7)
            displayMenu();
        }

         }





package SnacksTdd;

public class AirLine {
    public Object bookTickets;
    private  boolean[] seats;
    private   final int  firstClassTicketCategory =1;


public AirLine(){
    int numberOfSeatsOnPlane = 10;
    this.seats =new boolean[numberOfSeatsOnPlane];
}
    public boolean[] getSeats() {
        return seats;
    }

    public void bookTickets(int bookingCategory) {
        if (bookingCategory == firstClassTicketCategory) {
            for (int count = 0; count < seats.length; count++) {
                if (!seats[count]) seats[count] = true;
                break;

            }
        }
    }

    private void bookEconomyClassSeats(){


            }

        }


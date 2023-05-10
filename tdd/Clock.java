package tdd;

public class Clock {
    private int hour;

    public int setHour(int hour) {
        if (hour > 24) hour=0;{
            System.out.println("incorrect time");}
        return hour;
    }
    public int setMinutes(int minutes) {
        if (hour > 60) minutes = 0;
        return minutes;
    }

    public int setSeconds(int seconds) {
        if (seconds>60) seconds=0;
        return seconds;
    }


    }




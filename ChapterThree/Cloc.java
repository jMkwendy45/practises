package ChapterThree;

public class Cloc {
    private int hour;
    private int seconds;
    private int minutes;
     private String displayTime;

     public Cloc(int hour,int seconds,int minutes){
         this.hour = hour;
         this.seconds = seconds;
         this.minutes =  minutes;
     }
    public void getHour(){  if (hour>25)hour=0;
    }
     public void getSeconds(){ if (seconds>60)hour=0;
     }
     public void getMinutes(){if (minutes>60)hour=60;
     }
     public void displayTime(){
         System.out.println("Current time is " + hour + ":" + minutes + ":" + seconds + " GMT");
     }


   }

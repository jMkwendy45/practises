package ChapterEight;

public class Time {
    private int hour;
    private int seconds;
    private int minutes;


    public Time (int hour, int seconds, int minutes){
           validate(hour,seconds,minutes);
          this.hour=hour;
          this.seconds = seconds;
          this.minutes =minutes;
    }

    public Time(int hour,int minutes){
        this(hour,minutes,0);
    }
    public  Time(int hour){
        this(hour,0);
    }
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
          validateHour(hour);
        this.hour = hour;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
           validateSeconds(seconds);
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
           validateMinutes(minutes);
        this.minutes = minutes;
    }

    public static  void validate(int hour, int minutes, int seconds){

       validateHour(hour);
       validateMinutes(minutes);
       validateSeconds(seconds);
       }

    public  static  void  validateHour(int hour){
        boolean hourIsInvalid = hour<0||hour>23;
        if(hourIsInvalid) throw new IllegalArgumentException("hour  should be between 0 an 23 therefor it is invalid");
    }
    public static void  validateMinutes(int minutes){
        boolean minuteIsInvalid = minutes<0||minutes>59;
        if (minuteIsInvalid) throw new IllegalArgumentException("minute  should be between 0 and 59, therefore is invalid");
       }
       public  static  void validateSeconds(int seconds){
           boolean secondIsInvalid = seconds<0||seconds>=60;
           if (secondIsInvalid) throw  new IllegalArgumentException("seconds should be between 0 and 59 therefore is invalid");

       }

    }


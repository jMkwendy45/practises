package ChapterThree;

public class HeartRates {


    private String firstname;
    private String lastname;
    private final String  month;
    private final int    year;
    private final int  day;
    private int   age;
    private int  maximumHeartRate;


    public HeartRates(String firstname,String lastname,String month,int year,int day){
        this.firstname=firstname;
        this.lastname=lastname;
        this.month=month;
        this.year=year;
        this.day=day;
    }

   public void setAge(){ age = 2021-year;}

    public void setMaximumHeartRate(){maximumHeartRate=55*220-age;}

    public String getFirstname(){
    return firstname;
   }

   public String getLastname(){
        return lastname;
     }
     public int getAge(){age = 2021-year;
         return age;
    }
    public int getYear(){
        return year;
    }
    public int getDay(){
        return day;
    }
    public String getMonth(){
        return month;
    }
    public int getMaximumHeatRate(){maximumHeartRate=55*220-age;
        return maximumHeartRate;
    }

}




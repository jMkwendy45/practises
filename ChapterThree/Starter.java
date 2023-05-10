package ChapterThree;

public class Starter {
    private String firstname;
    private String lastname;
    private String gender;
    private String month;
    private int  day;
    private int year;
    private double height;
    private  double weight;
    private int  age;
    private int   maximumHeartRate;
    private double bmi;


    public Starter(String firstname, String lastname, String gender, String month,
        int day, int year, double height, double weight ){
    this.firstname=firstname;
    this.lastname=lastname;
    this.gender=gender;
    this.day=day;
    this.height=height;
    this.weight=weight;
    this.year=year;
    this.month=month;
}
    public void setFirstname(String firstname){}
    public void setLastname(String lastname){}
    public void   setGender   (String gender){}
    public void  setDay (int day){}
    public void  setMonth(String month){}
    public void  setHeight(double height){}
    public void  setYear(int year){}
    public void  setWeight(double weight){}


    public String getFirstname(){return firstname;}
    public String getLastname(){return lastname;}
    public  String getMonth(){return month;}
    public String  getGender(){return gender;}
    public  int  getDay(){return day;}
    public  int getYear(){return year;}

     public  double getWeight(){ weight = weight*0.45359237;
        return weight;}

     public  double getHeight(){height= height*0.0254;
        return height;}

     public int getAge(){age = 2021-year;
        return age;
     }
     public int getMaximumHeatRate(){maximumHeartRate=50*220-age;
        return maximumHeartRate;}

     public double getBmi(){ double bmi = weight/height*height;
        return bmi;}




}

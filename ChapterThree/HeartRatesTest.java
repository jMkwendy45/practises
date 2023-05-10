package ChapterThree;



public class HeartRatesTest {
    public static void main(String[] args) {
        HeartRates heartRates = new HeartRates("mercy","duru","august",1995,4);


        heartRates.setAge();
        heartRates.setMaximumHeartRate();
        System.out.println("My first name is"+heartRates.getFirstname());
        System.out.println("My last name is" +heartRates.getLastname());
        System.out.printf("%s\n%d\n%d\n", heartRates.getMonth(), heartRates.getYear(), heartRates.getDay());
        System.out.println( "My Age is\n" +heartRates.getAge());
        System.out.println("maximum heart rate is " +heartRates.getMaximumHeatRate());








    }


}

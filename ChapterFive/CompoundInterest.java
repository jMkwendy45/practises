package ChapterFive;

public class CompoundInterest {
    public static void main(String[] args) {

        double principal = 1000.0;

        System.out.printf("%s ,%n %s,%s", "Year", "Amount on deposit","Rate");

         double rate = 0.5;
        for (int year = 1; year < 10; year++) {
            double amount = principal * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%,20.2f%n ,%4s", year, amount,rate);
        }









    }
}

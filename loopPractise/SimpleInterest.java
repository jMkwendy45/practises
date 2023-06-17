package loopPractise;

public class SimpleInterest {
    public static void main(String[] args) {


        for (int i = 8; i >=2 ; i--) {
            double interestRate = calculateInterestRate(10000,i);
            System.out.println("the years"+i+ "the interestRate"+interestRate);

        }

    }
    private  static  double calculateInterestRate(double amount,double interestRate){
        return(amount*(interestRate/100));

    }
}

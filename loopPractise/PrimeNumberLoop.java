package loopPractise;

public class PrimeNumberLoop {
    public static void main(String[] args) {
        int count = 0;
        for (int numbeer = 10; numbeer < 53; numbeer++) {
            if (isPrime(numbeer)) {
                System.out.println("the num" + numbeer);
                count++;
                if (count == 3) {
                    break;
                }
            }

        }
    }

    public static boolean isPrime(int number) {

        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number%i==0){
                return false;
            }

        }
        return true;
    }

}
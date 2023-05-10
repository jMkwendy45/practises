package PersonalPractise;

import java.security.SecureRandom;

public class GenerateNumber {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();

        for (int counter = 1; counter <= 10; counter++) {
            int numbers = 1 + secureRandom.nextInt(10);
            System.out.printf("%3d  ", numbers);

            if (counter % 2 == 0) {
                System.out.println();
//
//            if (counter==5){
//                continue;
//            }
//            System.out.println();

            }
        }
    }
}
import java.util.Scanner;

public class EquivTrial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a binary integer,that has 0's and 1's ");
        int number = input.nextInt();
        int loopControl = (int) (Math.log10(number)+1);

        for (int index = 1; index < loopControl; index ++) {
            int division = number / index % 10;
            System.out.println(division);
//          int binaryDivision = division* divideNumber(number);
//            sum+= binaryDivision;
//             System.out.println(sum);
        }

    }
}
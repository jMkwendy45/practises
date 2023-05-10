package ChapterFour;

import java.util.Scanner;

public class TwoLargest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count = 1;
        int largestNumber = 0;
        int secondLargestNumber = 0;
        while (count <= 4) {
            System.out.print("Enter number " + count + ": ");
            int number = input.nextInt();
            if (number > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber =  number;
            } else if (number > secondLargestNumber) {
                secondLargestNumber = number;
            }
            count++;
        }
        System.out.println(" the largest number is "+largestNumber);
        System.out.println(" second largest number is "+secondLargestNumber);
    }
}




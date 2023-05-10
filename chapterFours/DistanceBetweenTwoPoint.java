package chapterFours;

import java.util.Scanner;

public class DistanceBetweenTwoPoint {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter x coordinate");
        int x1= input.nextInt();
        System.out.println("enter y coordinate");
        int y1 = input.nextInt();


        System.out.println("enter x coordinate");
        int x2= input.nextInt();
        System.out.println("enter y coordinate");
        int y2 = input.nextInt();


        if (x1==x2)
            System.out.println("the lines are on a pep to the y axis");
        else if (y1==y2) {
            System.out.println("the lines are on a line perpendicular to y axis ");
        }
        else {
            System.out.println("line is not perpendicular");

        }
    }
}

package ChapterFive;



public class TrianglePrinting {
    public static void main(String[] args) {

        int length = 10;

        for (int row = 0; row < length; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            for (int col = row; col < length; col++) {
                System.out.print("  ");
            }
            for (int col = row; col < length; col++) {
                System.out.print("* ");
            }
            for (int spaces = 0; spaces< row; spaces++) {
                System.out.print("  ");
            }
            for (int spaces = 0; spaces< row; spaces++) {
                System.out.print("  ");
            }
            for (int col = row; col < length; col++) {
                System.out.print("* ");
            }
            for (int spaces= row; spaces < length; spaces++) {
                System.out.print("  ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }


    }
}





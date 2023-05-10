package ChapterFive;

public class Triangle3 {
    public static void main(String[] args) {
        int space = 10;
        for (int row = 0; row < 10; row++) {
            for (int column = 0; column <= space; column++) {
                System.out.print(" ");
            }
            for (int shape = 0; shape <= row; shape++) {
                System.out.print("*");
            }
            System.out.println();
            space--;
        }
        System.out.println("\n\n");


    int length = 10;
        for (int i = 0; i < length; i++) {
        for (int j = 0; j <=i ; j++) {
            System.out.print("*");

        }
        System.out.println("");

    }

}

}

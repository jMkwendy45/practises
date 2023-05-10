package ChapterFive;

public class TriangleC {
    public static void main(String[] args) {
        int length = 10;
        for (int row = 0; row < length; row++) {
            for (int space = 0; space < row; space++) {
                System.out.print("  ");
            }

            for (int col = row; col <= length; col++) {
                System.out.print("*");
            }
            System.out.println();
//
//        }

        }
    }
}

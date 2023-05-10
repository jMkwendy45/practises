package ChapterFive;

public class Diamond {
    public static void main(String[] args) {

        int firstRow=1;
        int secondRowCounter = 7;
        int secondCounter = 7;
        int ThirdRowCounter = 3;
        for (int row = 0; row <5 ; row++) {
            for (int i = 0; i < secondRowCounter; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i <firstRow ; i++) {
                System.out.print("*");
            }
            for (int i = 0; i < ThirdRowCounter; i++) {
                System.out.print(" ");
            }
            secondRowCounter--;
            firstRow+=2;


            System.out.println();
        }
        secondRowCounter+=2;
        for (int i = 0; i < 5; i++) {
            for (int space = 0; space < secondRowCounter; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j <secondCounter ; j++) {
                System.out.print("*");
            }
            System.out.println();
            secondCounter-=2;
            secondRowCounter++;
        }
    }
}

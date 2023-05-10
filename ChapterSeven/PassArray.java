package ChapterSeven;

public class PassArray {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 4, 5, 6, 8};

        System.out.printf("Effects of passing reference to entire array:%n" +
                "The values of the original array are:%n");
        for (int array : arrays) {
            System.out.printf("  %d", array);
        }

        modifyArray(arrays);
        System.out.printf("%n%nThe values of the array are:%n");


    }
        public static void modifyArray(int[]arrays2) {
            for (int counter = 0; counter < arrays2.length; counter++) {
                arrays2[counter] *= 2;
                System.out.println(arrays2[counter]);


            }
        }
        public static void modifyElement(int element){
        element*=2;
            System.out.printf(
                    "Value of element in modifyElement: %d%n", element);

        }
    }

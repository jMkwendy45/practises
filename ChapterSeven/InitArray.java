package ChapterSeven;

public class InitArray {
    public static void main(String[] args) {
        int[]array = new int [10];
        System.out.printf("%s%8s%n","index","Value");
        for (int counter = 0; counter < array.length ; counter++){
            System.out.printf("%5d%5d%n",counter,array[counter]);
        }
    }


}

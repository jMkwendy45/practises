package ChapterSeven;

import PersonalPractise.Array;

import java.util.Arrays;

public class ArrayPractise {
    public static void main(String[] args) {
        String [] colors = new  String[7];

        try {
            colors[0] = "Red";
            colors[1] = "Orange";
            colors[2] = "Yellow";
            colors[3] = "Green";
            colors[4] = "Blue";
            colors[5] = "Indigo";
            colors[6] = "Violet";
            colors[7] = "pink";
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        System.out.println(colors[4]);


        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);

        }
        String colorArrays = Arrays.toString(colors);
        System.out.println(colorArrays);
    }
}

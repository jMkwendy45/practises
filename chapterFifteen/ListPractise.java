package chapterFifteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListPractise {
    public static void main(String[] args) {

        String[]colors ={"Black","Magnets","Gold","Purple","Brown","Golden","White"};

//        List<String> list = new ArrayList<>();
//
//        for (String color : colors){
//            list.add(color);
//        }


        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // Create and display a list containing the suits array elements
        List<String> list = Arrays.asList(suits);
        System.out.printf("Unsorted array elements: %s%n", list);
        Collections.sort(list);
        System.out.printf("Sorted array elements: %s%n", list);


    }
}

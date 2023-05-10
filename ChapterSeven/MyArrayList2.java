package ChapterSeven;

import java.util.ArrayList;

public class MyArrayList2 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(25);
        numbers.add(32);
        System.out.println("the array list is"+numbers);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));

        }


    }
}
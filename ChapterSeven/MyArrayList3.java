package ChapterSeven;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyArrayList3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4);
        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

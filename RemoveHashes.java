import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveHashes {
    public static void main(String[] args) {
        String [] arrayLetters= {"a", "b", "#","#","x","y","#"};
        System.out.println(deleteHash(arrayLetters));
    }
    public static ArrayList<String> deleteHash(String[] arrayLetters) {

        ArrayList<String> tempArrayHolder  = new ArrayList<>(List.of(arrayLetters));
        for (int index= 0;index<tempArrayHolder.size(); index++) {

            if (tempArrayHolder.get(index).equals("#")) {
                tempArrayHolder.remove(tempArrayHolder.get(index-1));
                index = 2;
            }
            System.out.println(tempArrayHolder);

        }
        return tempArrayHolder;
    }













//        List<String> arrays = new ArrayList<>();
//
//
//        for (int index = 0; index < array.length; index++) {
//            if (array[index].equals("#")) ;
//            arrays = new ArrayList<>();
//            continue;
//
//            // If the current string is a letter, append it to the output
//        }
//        return new String[]{arrays.toString()};
//    }
}
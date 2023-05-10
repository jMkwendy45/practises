package assesments;

import java.text.NumberFormat;
import java.util.Arrays;

public class ArrayElement {
    public static void main(String[] args) {
        char[][] arr = new char[3][];
        arr[0] = new char[]{'0','x','0'};
        arr[1] = new char[]{'x','x','0'};
        arr[2] = new char[]{'0','x','0'};
    }

     public static String displayOneLoop(char[][] arr) {

         String result = "";
         for (char[]chars: arr){
             result+=chars[0]+""+chars[1]+""+chars[2]+"\n";
         }
       return result;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }
     }
    public static String display2(char[][] arr) {
        String result = "";
        for (char[] collection : arr)
            for (char characters : collection) {
                if (characters == '0') result += "0";
                if (characters == 'x') result += "1";

                result += "\n";
            }
        return result;
    }

    }







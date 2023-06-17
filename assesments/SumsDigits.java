package assesments;

import java.math.BigInteger;

public class SumsDigits {
    public static void main(String[] args) {

        String s = "11111222223";
        addSplitNumber(s);

    }

    public static String s(String numbers) {
        String split = "";
        for (int i = 0; i < numbers.length(); i++) {
            if (i % 3 == 0) split += " ";
            split += numbers.charAt(i);
        }
        return split.strip();
    }

    public static void addSplitNumber(String word) {


        }
    }





















// if (i%3==0)split+=numbers.charAt(i);
////                else split+=numbers.charAt(i);
//}
//            return split.substring(0).strip();

package ChapterSix;

import java.util.Scanner;

public class beautifyingString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word : ");
        String word = input.next();
        System.out.println(checkUppercase(word));
    }

    public static String checkFullStop(String word) {
        if (word.endsWith(".")) {
            return word;

        } else {

            return word + ".";
        }
    }

    public static String checkUppercase(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase((i))) {
                return word;
            }

            }

           return word.toUpperCase();
        }
    }


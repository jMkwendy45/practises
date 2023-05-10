package ChapterThree;

import java.util.Locale;

public class SwitchPractise {
    public static void main(String[] args) {
        int switchValue = 16;
        switch (switchValue){
            case  11:
                System.out.println(" value is 12");
                break;
            case 12:
                System.out.println("value is 12");
                break;
            case 13: case 14: case 15:
                System.out.println("value is either 13,or 14 or 15");
                System.out.println("actual value is "+switchValue);
                break;
            default:
                System.out.println("value is not between 11-15");
                break;
        }
        String charValue ="A";
        switch (charValue) {
            case "A" -> System.out.println("value is a");
            case "U" -> System.out.println("switch value is B");
            case "P" -> System.out.println("switch value is c");
            default -> System.out.println("value is neither a or b or c");
        }

    }
}

package assesments;

public class StringPalidrome {
    public static void main(String[] args) {

        String numbers = "54329";
        for (int i = numbers.length()-1; i >=0; i--) {
            char value = numbers.charAt(i);
            System.out.println(value);

        }
    }
}

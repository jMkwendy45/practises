package ChapterSix;

public class MethodOverloadMain {
    public static void main(String[] args) {


        MethodOverload methodOverload = new MethodOverload();
        System.out.println(methodOverload.addNumbers(12,14.0));
        System.out.println(methodOverload.addNumbers(15.0,19));
        System.out.println(methodOverload.addNumbers(15));
    }
}
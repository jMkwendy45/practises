package ChibuzorAssigment;

public class FIzzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i <100; i++){
            if(i%3==0&&i%5==0) {
                System.out.println(i+" "+"Fizz buzz");
            } else if (i%3==0) {
                System.out.println(i+" "+"fizz");
            } else if (i%5==0) {
                System.out.println(i+" "+"buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }

}

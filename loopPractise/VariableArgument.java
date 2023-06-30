package loopPractise;

public class VariableArgument {
    public static void main(String[] args) {

        int average = calculateIntegers(10,10);
        int average2 = calculateIntegers(30,30,30);
        System.out.println(average);
        System.out.println(average2);

    }
    public  static int calculateIntegers(int...numbers){
        int total =0;
        for (int number:numbers){
               total+=number;
        }
        return total/numbers.length;
        }

    }




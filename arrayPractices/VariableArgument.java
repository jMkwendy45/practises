package arrayPractices;

public class VariableArgument {
    public static void main(String[] args) {

        System.out.println(average(1,7,9,0));
        System.out.println(average(45,90,76));
    }
    public static double average(int ...number){
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum+=number[i];
        }
        return (double) sum/number.length;

    }
}

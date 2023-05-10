package arrayPractices;

public class AboveAverageNumber {

    public static void main(String[] args) {
        int []number ={2,2,2,10,5};
        System.out.println(numberOfElements(number));




    }
    public static int sumOfArray(int[] number) {
        int sum = 0;
        for (int index = 0; index < number.length; index++) {
            sum += number[index];

        }
        return sum;
    }


    public static int averageOfTheSum(int[] number) {
        int average = 0;
        for (int index = 0; index < number.length; index++) {
            average = sumOfArray(number) / number[index];
        }
        return average;

    }


    public static int numberOfElements(int[] number){
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i]>averageOfTheSum(number))
                count = number[i];

        }

      return count;

}




}

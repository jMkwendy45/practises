package arrayPractices;

public class MinMaxSum {

    public static int minimumArray(int[] array) {
        int smallest = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] < smallest)
                smallest = array[index];

        }
        return smallest;
    }

    public static int maximumArray(int[] number) {
       int largest = number[0];
        for (int i = 0; i <number.length; i++) {
            if (number[i]>largest)
                largest = number[i];

        }
          return  largest;
        }

    public static int minimumSum(int[]number) {
        int miniSum=0;
        for (int i = 0; i <number.length ; i++) {
          miniSum=   sum(number)-maximumArray(number);

        }
        return miniSum;

    }

    public static int sum(int[]number) {
        int sum = 0;
        for (int i = 0; i <number.length ; i++) {
            sum+=number[i];

        }
        return sum;

    }

    public static int maximumSum(int[] number) {
        int maxSum=0;
        for (int i = 0; i <number.length ; i++) {
            maxSum=   sum(number)-minimumArray(number);

        }
        return maxSum;

    }

    public static int minmaximumSum(int[]number) {

        return minimumSum(number)+maximumSum(number);
    }
}

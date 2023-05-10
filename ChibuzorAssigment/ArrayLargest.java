package ChibuzorAssigment;

public class ArrayLargest {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 10, 70, 600, 100};

        int largestNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largestNum) {
                largestNum = array[i];

            }
        }
            System.out.println("the largest number is: " + largestNum);

        }
    }

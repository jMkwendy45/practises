package ChibuzorAssigment;

public class EvenArry {
    public static void main(String[] args) {

        int[] arrays = {2, 8, 8, 1, 5, 2, 1, 3, 6, 7};

        int count = 0;
        for (int array : arrays) {
            boolean countIsOdd = count % 2 != 0;
            if (countIsOdd) System.out.println(array);
            count++;
        }

    }
}
package ChibuzorAssigment;

public class ReverseList {
    public static void main(String[] args) {

        int[] arr = new int[]{12, 3, 6, 20};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}
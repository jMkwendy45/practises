package ChapterSeven;

public class ArrayPractise1 {

    public static int sumNumbers(int ... numbers) {
        int total = 0;
        for (int number : numbers){
            total+=number;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sumNumbers(1,2,3,4,5,5,6,7,9,6,7,7,9,7,78));

    }
}




//        int total = 0;
//        for (int number : numbers) {
//            total += number;
//        }
//        return total;
//    }
//
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        int total = sumArray(numbers);
//        System.out.println(total);



//        double [] numbers = {10,20,30,40,10};
//        int sum = 0;
//
//        for (int number : numbers) {
//            sum += number;
//
//



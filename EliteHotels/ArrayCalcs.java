package EliteHotels;

public class ArrayCalcs {
    public static void main(String[] args) {

        int[] array = {2, 4, 6, 3, 5, 1};

        System.out.printf("%s%8s%n", "Index", "Value");
          int product;
        for (int i = 0; i < array.length; i++) {
            product = array[i] * array[i];

//            System.out.println( product);
            System.out.printf("%5d%8d%n", array[i], product);

        }


    }
}
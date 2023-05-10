package tdd;

public class Maths {
    private int[] array;
    int counter = 0;

    public Maths(int number) {
        this.array = new int[number];
    }


    public int[] multiply(int[] number) {
        int[] products = new int[6];
        int product = 0;
        for (int i = 0; i < array.length; i++) {
            product = number[i] * number[i];
            products[i] = product;
        }
        return products;
    }

    public int[] ascendingOrder(int[] number) {
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] > number[j]) {
                    counter = number[i];
                    number[i] = number[j];
                    number[j] = counter;

                }
            }
        }
        return number;
    }

    public int[] desendingOrder(int[] number) {
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] < number[j]) {
                    counter = number[i];
                    number[i] = number[j];
                    number[j] = counter;

                }
            }
        }
        return  number;
    }
}


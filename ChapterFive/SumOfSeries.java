package ChapterFive;

public class SumOfSeries {
    public static void main(String[] args) {
            System.out.println("n\tSum");
            System.out.println("------------------");
                long sum =0;
            for (int n = 1; n <= 100; n++) {
                sum+=n;
//                long sum = (long) n * (n + 1) / 2; // using the formula for the sum of a series of consecutive integers

                System.out.println(n + "\t" + sum);
            }
        }
    }




package ChapterFive;

public class ValueOfPie {
    public static void main(String[] args) {
        double numerator = 4;
        double denominator = 1;
        double series = 0.0;

        for (int i = 1; i <= 200000; i++) {
            if (i % 2 == 0) {
                series -=  numerator/ denominator;
            } else {
                series += numerator / denominator;
            }
            denominator+=2;
            System.out.println(i + "            "+series);

        }

    }
}

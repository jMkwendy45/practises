package arrayPractices;

public class SetArrayElement {
    public static void main(String[] args) {
        int[] bestScores = {80, 95, 70, 60, 85, 90, 75, 65, 100, 55};
        int[] bonus = new int[20];
        int[] counts = new int[50];

        for (int i = 10; i <= 20; i++) {
            int countsName = counts[i] = 0;
        }
        for (int i = 0; i < bonus.length; i++) {
          int multiply=  bonus[i]*=2;
            System.out.println(multiply);
        }
        for (int bestScore : bestScores) {
            System.out.println(bestScore);
        }
    }
}
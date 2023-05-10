package ChapterFour;

import java.io.PrintStream;

public class WorldPopulation {
    public static void main(String[] args) {

  double growthRate = 0.88;
  long worldPopulation = 70000000;
  int year = 1;
  int currentPopulation = (int) (growthRate*worldPopulation);

  System.out.printf("%s\t%9s %12s","year","population","increase\n");

        for (int years = 1; years <75 ; years++) {
            int population_increase = (int) (worldPopulation+ currentPopulation);
            int new_population = currentPopulation + population_increase;

            System.out.printf("%d\t%d\t\t%d%n", year, new_population, population_increase);
                year++;

        }
        int n = 0;
        while (true) {
            double population = currentPopulation * Math.pow(1 + growthRate, n);
            if (population >= currentPopulation * 2) {
                System.out.printf("%nThe population will be double in the year %d%n", year + n);
                break;
            }
            n++;
        }


    }
}

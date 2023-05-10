package HackerRank;

import java.security.SecureRandom;
import java.util.Arrays;

public  class ArcheryGame {
    private int[][] scores = new int[2][2];

    public void printNumberOfPlayers() {
        System.out.printf("%s%15s\n\n", "Players number", "firstScore");
        for (int i = 1; i <= 4; i++) {
            System.out.println(i);
        }
    }

    public void firstChanceScore(int[][] array) {
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 1 + secureRandom.nextInt(9);
                System.out.println("the first chance scores are" + array[i][j]);
            }
                for (int[] num: array) {
                    System.out.println(Arrays.toString(num));
                
                }
            }
        }


    public void output() {
//        printNumberOfPlayers();
        firstChanceScore(scores);
//        secondChanceScores(scores);
//        thirdChanceScores(scores);
//        scoresOfAllThreeChances(scores);

    }

    public void secondChanceScores(int[][] array) {
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = 1 + secureRandom.nextInt(9);
                System.out.println("the  second chance scores are" + array[i][j]);

            }
        }
    }

    public void thirdChanceScores(int[][] array) {
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = 1 + secureRandom.nextInt(9);
                System.out.println("the third chance scores are" + array[i][j]);

            }
        }
    }
    public  void  scoresOfAllThreeChances(int[][]array){
        for ( int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
            }


            for (int j = 0; j <array[i].length ; j++) {

                int total = 0;
                 total = total+array[i][j];

                System.out.println(total);
            }

        }

    }
    }

package graceAssesments;

import java.util.Scanner;

public class GradeBooks {
    private int numberOfSubject;
    private int[][] grades;


    public GradeBooks(int numberOfSubject, int[][] grades) {
        this.grades = grades;
        this.numberOfSubject = numberOfSubject;
    }

    public void setNumberOfSubject(int numberOfSubject) {
        this.numberOfSubject = numberOfSubject;
    }

    public int getNumberOfSubject() {
        return numberOfSubject;
    }


    public void processGrade() {
        outPutGrades();
    }

    public double getAverage(int[] setOfGrades) {
        int total = 0;
        for (int grade : setOfGrades) {
            total += grade;

        }
        return (double) total / setOfGrades.length;
    }


    public void outPutGrades() {

        System.out.printf("The grades are:%n%n");
        System.out.print("             ");
        for (int test = 0; test < grades[0].length; test++) {
            System.out.printf("Test %d ", test + 1);

        }
        System.out.println("Average");

        for (int students = 0; students < grades.length; students++) {
            System.out.printf("Student %2d", students + 1);

            for (int test : grades[students]) { // output student's grades
                System.out.printf("%9d", test + 1);
            }
            double average = getAverage(grades[students]);
            System.out.printf("%9.2f%n", average);

        }
    }
}



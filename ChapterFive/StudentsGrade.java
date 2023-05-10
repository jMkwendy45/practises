package ChapterFive;

import java.util.Scanner;

public class StudentsGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            int numA = 0;
            int numB = 0;
            int numC = 0;
            int numD = 0;

            for (int i = 0; i < 5; i++) {
                System.out.print("Enter student name: ");
                String name = input.next();
                System.out.println(name);
                System.out.print("Enter student grade: ");
                char grade = input.next().charAt(0);

                switch (grade) {
                    case 'A':
                        numA++;
                        break;
                    case 'B':
                        numB++;
                        break;
                    case 'C':
                        numC++;
                        break;
                    case 'D':
                        numD++;
                        break;
                }
            }

            System.out.println("Number of students who received an A: " + numA);
            System.out.println("Number of students who received a B: " + numB);
            System.out.println("Number of students who received a C: " + numC);
            System.out.println("Number of students who received a D: " + numD);
        }
    }


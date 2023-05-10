package ChapterFour;

import java.util.Scanner;

public class ClassStudentsMain {
    public static void main(String[] args) {

        ClassStudent classStudent = new ClassStudent("chike",40.7);
        ClassStudent ClassStudent2 = new ClassStudent("Mercy",100);

        System.out.print("students name  is"+classStudent.getName());
        System.out.println("students grade is"+classStudent.getLetterGrade());

        System.out.print("students name is"+ClassStudent2.getName());
        System.out.print("students grade is"+ClassStudent2.getLetterGrade());





    }
}

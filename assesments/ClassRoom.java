package assesments;

import java.util.Arrays;

public class ClassRoom {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Student inem = new Student();
        inem.setFullName("inem legend");
        inem.setJavaScore(78);
        inem.setPythonScore(99);


        for (Student student : students) ;
        System.out.println(students);
        {
        }
        Arrays.stream(students).forEach(System.out::println);
    }
}

package studentManagment;

import java.util.ArrayList;
import java.util.List;

public class School {
    private static List<Student> students= new ArrayList<>();

  public  void admitStudent(Student student){
      students.add(student);

  }
  public int getTotalNumberOfRegisteredStudent(){
      return students.size();

  }
}

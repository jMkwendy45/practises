package studentManagment;

public class Student {
    private String firstName;
    private  String lastName;
    private  String id;
    private  String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public  void  setEmail(String email){
        this.email = email;
    }
    public  Student apply(StudentData  studentData){
        Student student = new Student();
        School school = new School();
        student.setFirstName(studentData.getFirstName());
        student.setLastName(studentData.getLastName());
        student.setEmail(studentData.getEmail());
        school.admitStudent(student);
        return student;
    }

}

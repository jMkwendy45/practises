package studentManagment;

public class StudentData {
    private  String firstName;
    private  String lastName;
    private  String Email;
    private String phoneNumber;
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
    public  void setEmail(String email){
        this.Email = email;
    }
    public  String getEmail(){
        return Email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public  String getPhoneNumber(){
        return phoneNumber;
    }
}

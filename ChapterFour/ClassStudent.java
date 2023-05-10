package ChapterFour;

public class ClassStudent {
    private String name;
    private double average;

    public ClassStudent(String name, double average) {
        this.name = name;
        if (average > 0.0) {
            if (average <= 100) {
            }
            this.average = average;
        }
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }

    public String getLetterGrade(){
        String letterGrade ="";
        
        if (average>=90.0){
            System.out.println("A");
        } else if (average>=80.0) {
            System.out.println("B");
        } else if (average>=70.0) {
            System.out.println("c");
            
        } else if (average>=60) {
            System.out.println("D");
        }
        else {
            letterGrade ="F";
        }
      return letterGrade;
    }
}

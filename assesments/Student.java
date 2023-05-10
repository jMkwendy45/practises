package assesments;

public class Student {
    private String fullName;
    private int javaScore;
    private int pythonScore;
    private int dataBaseScore;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getJavaScore() {
        return javaScore;
    }

    public void setJavaScore(int javaScore) {
        javaScore = javaScore;
    }

    public int getPythonScore() {
        return pythonScore;
    }

    public void setPythonScore(int pythonScore) {
        this.pythonScore = pythonScore;
    }

    public int getDataBaseScore() {
        return dataBaseScore;
    }

    public void setDataBaseScore(int dataBaseScore) {
        this.dataBaseScore = dataBaseScore;
    }
     public  String toString(){
         int total = javaScore+ pythonScore +dataBaseScore;
         double average = total/3.0;
        return """
                   %s        %s,        %s,          %s,     %s
                ,fullName, JavaScore,DataBaseScore,PythonScore,total,average\040""";
     }

}


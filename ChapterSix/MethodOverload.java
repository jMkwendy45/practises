package ChapterSix;

public class MethodOverload {


    public double addNumbers(int num1,double numb2){
        return (int) (num1+numb2);
    }
    public int addNumbers(double num1,int num2){
        return (int) ((int) num2+(double) num1);
    }
    public  int addNumbers(int num4){
        int sum=  num4 + num4;
        return sum;
    }
}

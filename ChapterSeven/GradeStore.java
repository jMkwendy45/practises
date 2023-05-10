package ChapterSeven;

import java.util.Arrays;

public class GradeStore {

    private int[]Grade;

    public GradeStore(int[] Grade){
        this.Grade=Grade;
    }
    public int getHighest() {
       int highest = Grade[0];
        Arrays.sort(Grade);
        System.out.println("the highest is"+highest);

        return highest;
    }
    public int getLowest() {

        int lowest=Grade[0];

         Arrays.sort(Grade);
                System.out.println("the lowest is" + lowest);


                return lowest;
            }


    public void getTotal() {
        int total = 0;
        int i = 0;
        for (int grade : Grade) {
            total += grade;
            i = total / Grade.length;
        }
        System.out.println("the average is" + (double) +i);


    }

    public void processGrade(){
        getHighest();
        getLowest();
        getTotal();

}











}

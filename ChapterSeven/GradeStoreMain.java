package ChapterSeven;

public class GradeStoreMain {
    public static void main(String[] args) {
        int[] gradeArray = { 100,40, 60, 80, 70, 65, 90, 55, 30, 67};


   GradeStore gradeStore = new GradeStore(gradeArray);
   gradeStore.processGrade();

    }
}

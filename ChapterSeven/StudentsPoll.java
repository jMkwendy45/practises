package ChapterSeven;

public class StudentsPoll {
    public static void main(String[] args) {

        int[]response = {1,2,3,4,5,5,5,4,4,2,2,1,2,4,5,4,3,2,1};
       int[]frequency = new int[6];

           for (int responses : response) {
               ++frequency[responses];
           }


            System.out.printf("%s%10s%n","Rating","Frequency");
        for (int rating = 1; rating < frequency.length ; rating++) {
            System.out.printf("%6d%10d%n",rating,frequency[rating]);
            
        }

        }

    }

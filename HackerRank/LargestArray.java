package HackerRank;
public class LargestArray {
    public static void main(String[] args) {


        int[]array={90,5,20,70,5,4,100,34,65};
        int largestNum = array[0];

        for (int i = 0; i <array.length ; i++) {
            if (array[i] > largestNum) {
                {
                    largestNum = array[i];
                }
            }
        }
        System.out.print("The largest number is"+largestNum);

    }
}

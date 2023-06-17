package loopPractise;

public class LoopPract2 {
    public static void main(String[] args) {



        int[]responses = {1,2,3,4,5,6,7};

        int[]frequency = new int[6];


        for (int answer = 0; answer < responses.length ; answer++) {
                try {
                    ++frequency[responses[answer]];
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e); // invokes toString method
                    System.out.printf(" responses[%d] = %d%n%n",
                            answer, responses[answer]);
                }
            }


        for (int rating = 1; rating < frequency.length ; rating++) {
            System.out.println(rating+""+frequency[rating]);

        }










    }
}

package chapterFours;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.printf("%8s%8s%8s%8s\n", "N", "N2", "N3", "N4");

        for (int i = 1; i <= 5; i++) {
             int N2 = i*i;
             int N3 = N2*i;
             int N4 = N3*i;

        System.out.printf("%8d%8d%8d%8d\n",i,N2,N3,N4);


        }

    }





}

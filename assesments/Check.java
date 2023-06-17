package assesments;

public class Check {
    public static void main(String[] args) {

        int counter =10;
        for (int i = 0; i <=counter ; i++) {
              if(i==7||i==5){
                  continue;
              }
            System.out.println(i);
        }
    }
}

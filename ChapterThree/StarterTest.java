package ChapterThree;

public class StarterTest {
    public static void main(String[] args) {

        Starter starter = new Starter("Ore","Oluwa","female",
                                    "April",4,1993, 14.0,76.0);


        System.out.println("My name is"+starter.getFirstname());
        System.out.println("My surname is" +starter.getLastname());
        System.out.println();



    }


}

package filePractise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SetStandardStreams {
    public static void main(String[] args) throws FileNotFoundException {

        System.setIn(new FileInputStream(
                new File("C:\\Users\\USER\\IdeaProjects\\Wendy Topaz\\src\\filePractise\\copy-from.txt"))
        );
        Scanner scanner = new Scanner(System.in);
        System.out.print(scanner.nextLine());
    }
}
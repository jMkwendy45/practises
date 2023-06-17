package filePractise.inputStream;

import java.io.FileReader;
import java.io.IOException;

public class MYFileReader {
    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("text.txt")){
            char[]text = new char[100];
             fileReader.read(text);
             for (char ch:text){
                 System.out.print(ch);
             }
        }catch (IOException e){
            System.err.println();

        }
    }
}

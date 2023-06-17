package filePractise.inputStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {
    public static void main(String[] args) {
        try(
                FileReader fileReader = new FileReader("fileWriter.txt");
                BufferedReader reader = new BufferedReader(fileReader)
        ){
            char[]text = new char[102];
            reader.read(text);
            for(char ch:text){
                System.out.print(ch);
            }


        }
        catch (IOException exception){
            System.err.println("Error"+exception);
        }
    }
}

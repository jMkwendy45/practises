package filePractise.outputStream;

import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("fileWriter.txt")){
            fileWriter.write("""
                    Hello there is a 
                    tide in the affairs 
                    of memn pleasw be strong
                    """);

        }catch (IOException exception){
            System.err.println("ERROR::"+exception);
        }
    }
}

package filePractise.outputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class TextFileWriter {
    public static void main(String[] args) {



      try(FileOutputStream fileOutputStream = new FileOutputStream("text.txt",true)){

          fileOutputStream.write("""
                  Malek with the money
                  Favour with the Swag
                  Dominic with the lies
                  Legend for the ladies
                  sheriff with ChatGpt
                  Cephas With the sleeply -eyes
                  """.getBytes());
      }catch (IOException exception){
          System.err.println("ERROR!!");
      }
    }
}

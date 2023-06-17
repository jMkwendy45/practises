package filePractise.outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TextFileWriterRedirectPrintStream {
    public static void main(String[] args) throws FileNotFoundException {

      FileOutputStream errorStream;

      try(
              FileOutputStream fileOutputStream = new FileOutputStream("/a/b/femi.txt",true)){

          fileOutputStream.write("""
                  Malek with the money
                  Favour with the Swag
                  Dominic with the lies
                  Legend for the ladies
                  sheriff with ChatGpt
                  Cephas With the sleeply -eyes
                  """.getBytes());
      }catch (IOException exception){

          System.setErr(new PrintStream(new FileOutputStream("error.txt")));
          System.err.println("ERROR!!"+exception.getMessage());
      }
    }
}

package filePractise.outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriter {
    public static void main(String[] args) {
        Person person = new Person("jadon",100);

        try(var fileOutPutStream = new FileOutputStream("person");
                var objectOutputStream  =
                        new ObjectOutputStream(fileOutPutStream)){
                objectOutputStream.writeObject(person);

        }catch (IOException exception){
            System.err.println("Error!!!!"+exception.getMessage());

        }
    }
}

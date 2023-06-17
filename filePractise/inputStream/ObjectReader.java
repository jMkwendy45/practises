package filePractise.inputStream;

import filePractise.outputStream.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {
    public static void main(String[] args) {
        try(var fileInputStream = new FileInputStream("C:\\Users\\USER\\IdeaProjects\\Wendy Topaz\\person");
            var objectStream =
            new ObjectInputStream(fileInputStream)){
            Object readObject = objectStream.readObject();
            Person person = (Person) readObject;
            System.out.println(person);
        }catch(IOException| ClassNotFoundException exception){
            System.err.println("ERROR"+exception.getMessage());
        }
    }
}

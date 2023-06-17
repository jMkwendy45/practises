package filePractise.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

public class CatJsonSerializer {
    private Cat cat;



    public static String convertToJson(Cat cat) {

        ObjectMapper objectMapper = new ObjectMapper();
        try (var StringWriter = new StringWriter()) {
            objectMapper.writeValue(StringWriter, cat);
            return StringWriter.getBuffer().toString();
        } catch (Exception exception) {
            System.err.println("Error" + exception);
            throw new RuntimeException(exception);

        }
    }
    public static Cat convertToCat(String json){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Cat cat = objectMapper.readValue(json,Cat.class);
            return  cat;
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }



    }
    public  static  void writeToJsonFile(){
        ObjectMapper objectMapper = new ObjectMapper();
        Cat cat = new Cat("Dupsy","indigo");
//        try {
////            objectMapper.writeValue(new FileWriter("cat.jsom"));
////        } catch (IOException e) {
////            throw new RuntimeException(e);
//        }
    }

    public static void main(String[] args) {
        writeToJsonFile();
    }
}

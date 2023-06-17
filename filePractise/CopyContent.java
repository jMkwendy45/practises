package filePractise;

import java.io.*;

public class CopyContent {
    public static void main(String[] args) {

        String pathName = "C:\\Users\\USER\\IdeaProjects\\Wendy Topaz\\src\\filePractise\\copy-from.txt";

        String sendToPath = "C:\\Users\\USER\\IdeaProjects\\Wendy Topaz\\src\\filePractise\\sent-to.txt";


        try(InputStream inputStream = new FileInputStream(new File(pathName));
            OutputStream outputStream = new FileOutputStream(new File(sendToPath))){

            byte[] contentFromCopyFromFile = inputStream.readAllBytes();
            outputStream.write(contentFromCopyFromFile);

        }catch (IOException exception){
            System.err.println(exception.getMessage());

        }




    }
}

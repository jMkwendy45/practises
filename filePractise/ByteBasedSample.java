package filePractise;

import java.io.*;

public class ByteBasedSample {
    public static void main(String[] args) {
//        InputStream inputStream = null;
//        try{
//            inputStream = new FileInputStream(("C:\\Users\\USER\\IdeaProjects\\Wendy Topaz\\src"));
//            inputStream.close();
//        }
//        catch (IOException exception){
//            System.err.println(exception.getMessage());
//        }
//        finally {
//            try {
//                if (inputStream!=null)inputStream.close();
//            }catch (IOException e){
//                System.err.print(e.getMessage());




        OutputStream outputStream= null;
        try{
            outputStream = new FileOutputStream(("src\\filePractise\\elite.txt"));
            outputStream.write(30);
            System.out.write(69);
            System.out.flush();
        }
        catch (IOException exception){
            System.err.println(exception.getMessage());
        }
        finally {
            try {
                if (outputStream!=null)outputStream.close();
            }catch (IOException e){
                System.err.print(e.getMessage());
            }
        }
    }
}

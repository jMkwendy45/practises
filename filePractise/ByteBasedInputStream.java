package filePractise;

import java.io.*;
import java.util.Arrays;

public class ByteBasedInputStream {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        try{
            inputStream= new FileInputStream(("src\\filePractise\\elite.txt"));
//            byte[]content = inputStream.readAllBytes();
//            System.out.println(Arrays.toString(content));
            int content = inputStream.read();
            System.out.write(content);
            System.out.println(content);
            System.out.flush();
        }
        catch (IOException exception){
            System.err.println(exception.getMessage());
        }
        finally {
            try {
                if (inputStream!=null)inputStream.close();
            }catch (IOException e){
                System.err.print(e.getMessage());
            }
        }
    }
    }

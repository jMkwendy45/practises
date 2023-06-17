package filePractise.inputStream;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream(
                    "C:\\Users\\USER\\OneDrive\\Desktop\\Apprentiship Main.docx");

            XWPFDocument  document= new XWPFDocument(fileInputStream);
              var paragraphs = document.getParagraphs();
              for(XWPFParagraph paragraph:paragraphs){
                  System.out.println(paragraph.getParagraphText());

              }
            }
              catch (IOException exception) {
            System.err.println("Error creating stream to file::" + exception.getMessage());
        }
    }
}

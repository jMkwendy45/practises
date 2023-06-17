package filePractise;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class FileSample {
    public static void main(String[] args) throws IOException {

//        Path path = Path.of("src","filePractise","second-file.txt");
//        Files.createFile(path);
//        File file = new File("fav.txt");
//
//        Path path = Path.of("src\\dir\\srcDir");
//        Files.createDirectories(path);
//        Files.createDirectories(path);

     Path path = Paths.get("C:\\Users\\USER\\IdeaProjects\\Wendy Topaz\\src\\chapterFour");
        DirectoryStream<Path>contents =Files.newDirectoryStream(path);
        for (Path content:contents){
            System.out.println(content.getFileName());
        }

//        Iterator<Path> iterator = contents.iterator();
//        while (iterator.hasNext()){
//            Path content = iterator.next();
//            System.out.println(content.getFileName());
//        }
    }
}

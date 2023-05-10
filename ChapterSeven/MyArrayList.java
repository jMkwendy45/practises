package ChapterSeven;

import java.nio.file.DirectoryNotEmptyException;
import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("Jerry");
        items.add("inem");
        items.add("zaza");
        items.add("kinzy") ;
        items.add(2,"cephas");
        items.add("legend");
        System.out.println(items);
        System.out.println("we have"+items.size()+"people in our list");
        System.out.println("lets remove some whimps!!!");
        items.remove("jerry");
      System.out.println(items);
        System.out.println(items.clone());
        System.out.println("we have"+items.size()+"people in our list");
        System.out.println(items.contains("inem"));
        System.out.println(items.contains("jerry"));
        System.out.println(items.lastIndexOf("kinzy"));
        items.add("kinzy");
        System.out.println(items.lastIndexOf("kinzy"));

    }

}

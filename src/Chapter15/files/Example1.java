package Chapter15.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example1 {

    public static void main(String[] args) {

        Path path =
                Paths.get("C:\\Users\\user\\IdeaProjects\\adewunmiAdegunwa\\src\\Chapter14\\.sample.txt");

//        checks to see if path point to a directory
        System.out.println("is directory::" +Files.isDirectory(path));

//        checks to see if file points to a hidden resource
        try{
            System.out.println("is hidden " +Files.isHidden(path));
        }catch(IOException exception){
            System.out.println(exception.getMessage());
        }

//        checks to see if file point to a resource that exists
        System.out.println("Exists?" +Files.exists(path));
    }

}

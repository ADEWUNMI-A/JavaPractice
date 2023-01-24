package Chapter15.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example2 {

    public static void main(String[] args) {

        Path currentDirectory = Paths.get("").toAbsolutePath();
        System.out.println(currentDirectory);
        Path target =
                Paths.get("C:\\Users\\user\\IdeaProjects\\adewunmiAdegunwa\\src\\Chapter15\\PrintStream\\Example2.java");
        Path relative = currentDirectory.relativize(target);

        System.out.println(relative.getFileName());
        System.out.println("isDirectory:: " +Files.isDirectory(relative));
        System.out.println("exists:: " +Files.exists(relative));

        try{
                   Files.getLastModifiedTime(relative);
                }
                catch (IOException exception){
//                    exception.printStackTrace();
                    System.out.println(exception.getMessage());
                }

    }
}

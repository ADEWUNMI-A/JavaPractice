package Chapter15;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAndDirectoryInfo {

    public static void main(String[] args) {

        String path = "C:\\Users\\user\\IdeaProjects\\adewunmiAdegunwa\\src\\Chapter15\\test3.txt";
        Path paths =
                Paths.get("C:\\Users\\user\\IdeaProjects\\adewunmiAdegunwa\\src\\Chapter15\\test3.txt");

        if (Files.exists(Path.of(path))){
            System.out.println("exists:: " + Files.exists(Path.of(path)));
        }
        if (Files.exists(paths)){
            System.out.println("exists:: " + Files.exists(paths));
        }

    }
}

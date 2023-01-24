package Chapter15;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputSample {
    public static void main(String[] args) {
        try (FileOutputStream stream = new FileOutputStream
                ("C:\\Users\\user\\IdeaProjects\\adewunmiAdegunwa\\src\\Chapter15\\test2.txt")) {
            stream.write("Paragons".getBytes());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

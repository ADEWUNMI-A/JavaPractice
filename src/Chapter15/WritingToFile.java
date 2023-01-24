package Chapter15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {

    public static void main(String[] args) {

        String path = "C:\\Users\\user\\IdeaProjects\\adewunmiAdegunwa\\src\\Chapter15\\test3.txt";

        try(FileWriter writer = new FileWriter(path, true);
            BufferedWriter write1 = new BufferedWriter(writer)) {

            write1.write("\nyyyyyyyyyyyyyyy");
        }

        catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
}

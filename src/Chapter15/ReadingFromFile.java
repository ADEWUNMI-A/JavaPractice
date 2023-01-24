package Chapter15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile {

    public static void main(String[] args) {

        String path = "C:\\Users\\user\\IdeaProjects\\adewunmiAdegunwa\\src\\Chapter15\\test2.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

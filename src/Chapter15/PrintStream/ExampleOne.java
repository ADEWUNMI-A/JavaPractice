package Chapter15.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ExampleOne {

    public static void main(String[] args) throws FileNotFoundException {
        try (PrintStream printStream =
                     new PrintStream("C:\\Users\\user\\IdeaProjects\\adewunmiAdegunwa\\src\\Chapter15\\test.txt")){
           printStream.println("Semicolon Africa");
        }
        catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

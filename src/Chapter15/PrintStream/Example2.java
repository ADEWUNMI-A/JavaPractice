package Chapter15.PrintStream;

import java.io.IOException;
import java.io.PrintStream;

public class Example2 {
    public static void main(String[] args) {
        try(PrintStream printStream = new PrintStream("output.txt")){
            System.setOut(printStream);
            System.out.println("Amala!!!");
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
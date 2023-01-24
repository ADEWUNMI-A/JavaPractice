package Chapter15;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class DataOutputSample {

    public static void main(String[] args) {

//            System.setIn();
//            System.setOut();
//            System.setErr();
//        PrintStream altOut = new PrintStream();
        byte[] bytes = "Hello, World!".getBytes();
        try(PrintStream altOut = new PrintStream
                ("C:\\Users\\user\\IdeaProjects\\adewunmiAdegunwa\\src\\Chapter15\\test3.txt")){
        System.setOut(altOut);
        try(DataOutputStream dos = new DataOutputStream(System.out)){
            dos.write(bytes);
        }catch(IOException e) {
            System.err.println(e.getMessage());
        }

        } catch(IOException e) {
            System.err.println(e.getMessage());
        }
    }
}

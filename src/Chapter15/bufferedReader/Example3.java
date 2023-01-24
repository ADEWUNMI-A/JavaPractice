package Chapter15.bufferedReader;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

    public class Example3 {
        public static void main(String[] args) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("Intellij.txt"))) {
                writer.write("Intelli Jerry");
            } catch (IOException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

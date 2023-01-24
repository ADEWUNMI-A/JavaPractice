package Chapter15.bufferedReader;

import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.io.*;

public class Example2 {
        public static void main(String[] args) {
/*
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/david/IdeaProjects/Java-practice/src/output.txt"))) {
            System.out.println(bufferedReader.readLine());
        } catch (IOException exception) {
            System.err.println("Exception message:: "+exception.getMessage());
        }

*/
            Logger logger = LoggerFactory.getLogger(Example2.class);
            try(BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/david/IdeaProjects/Java-practice/src/output.txt"))){
                // try(BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/david/IdeaProjects/Java-practice/output.txt"))){ //To see the error message
                System.out.println(bufferedReader.readLine());
            }catch (IOException exception){
                logger.error(() -> exception.getMessage());
            }

        }

}

//package Chapter15;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Arrays;
//
//public class FilesSample {
//    public static void main(String[] args) {
//        byte[] bytes = new byte[30];
//        try {
//            FileInputStream stream = new FileInputStream
//                    ("C:\\Users\\user\\IdeaProjects\\adewunmiAdegunwa\\src\\Chapter15\\test.txt");
//            stream.read(bytes);
//            for(byte b: bytes) {
//                if (b != 0) {
//                    System.out.print(Character.toString(b));
//                }
//                stream.close();
//            }
////                System.out.println(Arrays.toString(bytes));
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//}

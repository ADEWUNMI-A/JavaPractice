package tdd;

public class PrintingTriangle {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            for (int number = 1; number <= i; number++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

package tdd;

public class PrintingTriangle2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for(int gap = 0; gap < i + 1; gap++) {
                System.out.print(" ");
                for (int number = 10; number > i; number--) {
                    System.out.print(" *");
                }
            }
        }
    }
}

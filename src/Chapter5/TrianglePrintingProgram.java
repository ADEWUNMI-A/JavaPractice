package Chapter5;

public class TrianglePrintingProgram {

    public static void main(String[] args) {

        String star = "*";
        for (int i = 1; i <= 10; i++){
            System.out.print(star.repeat(i));
            System.out.print(" ".repeat(11 - i));

            System.out.print(star.repeat(11 - i));
            System.out.print(" ".repeat(i));

            System.out.print(" ".repeat(i));
            System.out.print(star.repeat(11 - i));

            System.out.print(" ".repeat(11 - i));
            System.out.println(star.repeat(i));
        }
    }
}

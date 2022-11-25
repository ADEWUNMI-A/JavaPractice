package Chapter5;

public class MultiplicationTable {

    public static void main(String[] args) {

        for(int i = 0; i <= 20; i++) {
            for(int j = 0; j < 12; j++) {
                int multiply = i * j;
                System.out.printf("%d %2s %d %2s %d %s", i, "*", j, "=", multiply, "       ");
            }
            System.out.println();
        }


    }
}

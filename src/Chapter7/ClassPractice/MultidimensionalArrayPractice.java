package Chapter7.ClassPractice;

import java.util.Arrays;

public class MultidimensionalArrayPractice {
    public static void main(String[] args) {
        int[][] numbers = new int[9][9];

        numbers[3][4] = 1;
        numbers[1][5] = 1;
        numbers[2][3] = 1;
        numbers[0][6] = 1;
        numbers[1][8] = 1;
        numbers[8][6] = 1;
        numbers[0][7] = 1;

        for (int[] number : numbers) {
            for (int i = 0; i < numbers.length; i++) {
                if (number[i] == 1) {
                    System.out.print(" * ");
                } else System.out.print(" - ");
            }
            System.out.println();
        }

    }

}

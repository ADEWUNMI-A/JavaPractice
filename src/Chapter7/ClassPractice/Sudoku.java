package Chapter7.ClassPractice;

import java.util.Arrays;

public class Sudoku {
    public static void main(String[] args) {

        int[][] numbers = new int[9][9];
        for(int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
               int value = row + column + 1;
               if (value > 9) {
                   value = value % 9;
               }
               numbers[row][column] = value;
            }
        }

        for (int[] number : numbers) {
            for (int sudoku : number) {
                System.out.printf(" %d ", sudoku);
            }
            System.out.println();
        }
    }
}

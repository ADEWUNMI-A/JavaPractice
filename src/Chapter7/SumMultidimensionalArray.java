package Chapter7;

import java.util.Arrays;

public class SumMultidimensionalArray {
    public static void main(String[] args) {

        int[][] array = new int[4][3];
        array[0][0] = 2;
        array[0][1] = 3;
        array[0][2] = 5;
        array[1][0] = 6;
        array[1][1] = 7;
        array[1][2] = 9;
        array[2][0] = 4;
        array[2][1] = 3;
        array[2][2] = 1;
        array[3][0] = 4;
        array[3][1] = 5;
        array[3][2] = 6;


        int [] total = new int[3];
        for(int column = 0; column < array[1].length; column++) {
            int sum = array[0][column] + array[1][column] + array[2][column] + array[3][column];
            total[column] = sum;
        }

        System.out.println(Arrays.toString(array[0]));
        System.out.println(Arrays.toString(array[1]));
        System.out.println(Arrays.toString(array[2]));
        System.out.println(Arrays.toString(array[3]));

        System.out.println(Arrays.toString(total));
    }
}

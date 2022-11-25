package Chapter7.ClassPractice;

import java.util.Arrays;

public class MultidimensionalArray {

    public static void main(String[] args) {
        int [][] arrays = new int[3][5];
        System.out.println(Arrays.deepToString(arrays));
        arrays[1][0] = 67;
        System.out.println(Arrays.deepToString(arrays));
        for(int i = 0; i < arrays.length; i++){

        }
    }
}

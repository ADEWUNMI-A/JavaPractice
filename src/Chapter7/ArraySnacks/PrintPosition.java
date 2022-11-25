package Chapter7.ArraySnacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrintPosition {
    public static int[] printOddPosition(int[] numberList) {

        int[] tempArrayInOddPosition = new int[numberList.length];

        for (int index = 0; index < numberList.length; index++) {
            if (index % 2 != 0) {
                tempArrayInOddPosition[index] = numberList[index];
            }
        }
        return tempArrayInOddPosition;
    }



    public static ArrayList<Integer> printEvenPosition(int[] numberList) {

        ArrayList <Integer> arrayInEvenPosition = new ArrayList<>();
        for(int index = 0; index < numberList.length; index++) {
            if (index % 2 == 0) {
                arrayInEvenPosition.add(numberList[index]);
            }
        }
        return arrayInEvenPosition;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(printEvenPosition(numbers));
    }
}

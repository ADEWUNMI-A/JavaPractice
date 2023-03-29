package Chapter7.ArraySnacks;

import java.util.ArrayList;
import java.util.Scanner;

public class RunningTotal {

    public static int runningTotalOf(ArrayList<Integer> numberList) {
        int total = 0;
        for (int index = 0; index < numberList.size(); index++) {
            total += numberList.get(index);
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        int number = 1;
        while (number != 0) {
            System.out.println("Enter a number and 0 to end: ");
            number = sc.nextInt();
            numberList.add(number);
            System.out.println(runningTotalOf(numberList));
        }
    }
}

package Chapter7.ArraySnacks;
//Write a function that returns the largest element in a list

import java.util.ArrayList;
import java.util.Scanner;

public class LargestNumber {

    public static int largestOf(ArrayList<Integer> numberList) {
        int maxList = numberList.get(0);
        for (int index = 0; index < numberList.size(); index++) {
            if (numberList.get(index) > maxList) {
                maxList = numberList.get(index);
            }

        }
        return maxList;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        int number = 0;
        while (number != -1) {
            System.out.println("Enter a number: ");
            number = sc.nextInt();
            numberList.add(number);
        }
            System.out.printf("%s%d","The largest number is: ",largestOf(numberList));
    }
}



package Chapter7.ClassPractice;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];
        int count = 0;
        int counter = 0;


       while(count != 5){
           System.out.println("Please enter a valid number: ");
           int input = sc.nextInt();
           if(input >= 0 && input <= 100) {
               number[counter] = input;
               count++;
               counter++;
           }
           else System.out.println("Enter a valid number.");
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int index = 0; index < number.length; index++) {
            if(number[index] > max){
                max = number[index];
            }
            else
                min = number[index];

        }

        System.out.printf("The maximum number is: %d", max);
        System.out.printf("%nThe minimum number is: %d", min);

    }
}


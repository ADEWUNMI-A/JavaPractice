package Chapter4;

import java.util.Scanner;

public class Cryptography {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 numbers: ");
        int number = sc.nextInt();
        int length = String.valueOf(number).length();
        int forthDigit = 0;
        int thirdDigit = 0;
        int secondDigit = 0;
        int firstDigit = 0;
        int firstTemp = 0;
        int secondTemp = 0;
        if (length == 4) {

            int temp4 = number % 10;
            firstDigit = temp4 + 7;

            int temp3 = (number / 10) % 10;
            secondDigit = temp3 + 7;

            int temp2 = (number / 100) % 10;
            thirdDigit = temp2 + 7;

            int temp1 = (number / 1000) % 10;
            forthDigit = temp1 + 7;

            System.out.printf("Adding 7 to the numbers %n %d %d %d %d %n", forthDigit, thirdDigit, secondDigit, firstDigit);

            forthDigit %= 10;
            thirdDigit %= 10;
            secondDigit %= 10;
            firstDigit %= 10;

            System.out.printf("Dividing the result by 10 %n %d %d %d %d %n",+ firstDigit, secondDigit, thirdDigit, forthDigit );

        }

            firstTemp = forthDigit;
            forthDigit = secondDigit;
            secondDigit = firstTemp;

             secondTemp = thirdDigit;
            thirdDigit = firstDigit;
            firstDigit = secondTemp;

        System.out.printf("Swapping the digits %n %d %d %d %d %n", firstDigit, secondDigit, thirdDigit, forthDigit);


   //to decrypt
        firstTemp = forthDigit;
        forthDigit = secondDigit;
        secondDigit = firstTemp;

        secondTemp = thirdDigit;
        thirdDigit = firstDigit;
        firstDigit = secondTemp;


        System.out.printf("Reversing the swap the digits %n %d %d %d %d", firstDigit, secondDigit, thirdDigit, forthDigit);
    }
}

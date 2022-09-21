package Chapter5;

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int addedNumber = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                addedNumber++;
            }
        }
        if (addedNumber == 2) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
    }
}

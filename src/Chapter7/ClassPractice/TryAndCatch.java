package Chapter7.ClassPractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryAndCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.printf("%nThe number is %d%n", number);
        } catch (InputMismatchException e) {
            System.out.println("Invalid number");
            System.out.println(e);
        }
        try
        {System.out.println(sum(50, 10));}

        catch (IllegalArgumentException e) {
            System.out.println("can not perform operation");
        }
        catch (InputMismatchException a) {
            System.out.println("Letters not allowed operation");
        }
    }

        public static int sum(int numb1, int numb2){
        if (numb1 > 100 || numb2 > 100) {
            throw new IllegalArgumentException("number is too high ");
        }

         int result = numb1 + numb2;
         return result;
        }



}

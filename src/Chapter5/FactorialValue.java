package Chapter5;
import java.util.Scanner;

public class FactorialValue {
    public static void main(String[] args) {

        int number = 1;
        int fact = 1;
        int counter;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        for (counter = 1; counter <= number; counter++) {
            fact = fact * counter;
        }
        System.out.printf("The factorial of %d is %d", number, fact);

    }
}



package Chapter5;
import java.util.Scanner;

public class GuessingApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int magicNumber = 29;
        int counter = 1;
        int number = 0;

        while (counter <= 3) {
            System.out.print("Guess a number: ");
            number = input.nextInt();
            if (number != magicNumber) {
                System.out.println("Oops! You guessed a wrong number");
                counter++;
            }
            else {
                System.out.println("Perfect! You guessed the right number.");
                break;
            }

        }
    }
}
package Chapter5;
import java.util.Scanner;
public class BarChart {
    public static void main(String[] args) {
        int counter = 1;
        int number = 0;
        int counter2 = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1 to 30: ");
            number = input.nextInt();
        while  (number < 1 || number > 30){
            System.out.print("Invalid number");
            break;
        }
            if (number <= 30) {
                for (counter = 1; counter <= number; counter++)
                    System.out.print("*");
            }
    }
}
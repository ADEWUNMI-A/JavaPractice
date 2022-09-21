import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
       int answer = 0;
        Scanner input = new Scanner(System.in);

          do {
              System.out.print("Enter the number: ");
              int number = input.nextInt();

              System.out.print("Enter the number: ");
              int number2 = input.nextInt();

              int sum = number + number2;
              System.out.printf("The sum of %d and %d is %d", number, number2, sum);
              System.out.printf("%n%nEnter 1 to continue: ");
                answer = input.nextInt();
          }
          while (answer == 1);
    }
}
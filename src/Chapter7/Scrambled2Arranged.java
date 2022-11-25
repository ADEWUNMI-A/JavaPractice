package Chapter7;
import java.util.Scanner;
public class Scrambled2Arranged {

    public static void ascOrder(int[] numbers) {

        for(int index = 0; index < numbers.length - 1;index++){

            for(int j = 0; j < numbers.length - index - 1; j++){

                if (numbers[j] > numbers[j+1]) {

                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] number;
        number = new int[5];
        try {
            for (int i = 0; i < number.length; i++) {
                System.out.println("Enter the numbers: ");
                number[i] = in.nextInt();
            }
            for (int i = 0; i < number.length; i++) {
                Scrambled2Arranged.ascOrder(number);
                System.out.print(number[i] + " ");
            }
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }
}

package Chapter4;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        int milesDriven = 0;
        double sumOfMilePerGallon = 0;

        while (milesDriven != -1) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the miles driven or -1 to stop: ");
            milesDriven = input.nextInt();
            if (milesDriven == -1) {
                System.out.println("Bye");
                break;
            } else {
                if (milesDriven > 0) {
                    System.out.print("Enter the gallons used or -1 to stop: ");
                    int gallon = input.nextInt();
                    if (gallon > 0) {
                        double milePerGallon = (double) milesDriven / gallon;
                        System.out.printf("The miles per gallon is: %.2f", milePerGallon);
                        sumOfMilePerGallon += milePerGallon;
                        System.out.printf("%nThe total gallon spent is %.2f", sumOfMilePerGallon);
                        System.out.println();
                    }
                    else System.out.println("Enter a valid number");
                }
                else
                    System.out.println("Enter a valid number");
            }
        }
    }
}

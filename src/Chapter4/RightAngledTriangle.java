package Chapter4;

import java.util.Scanner;

public class RightAngledTriangle {

    public static void rightAngle(int baseLength) {

        for (int row = 1; row <= baseLength; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.printf("%s %s", "*", " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base-length of triangle: ");
        int number = sc.nextInt();

        if (number > 10) {
            System.out.println("invalid input");
        }
        else RightAngledTriangle.rightAngle(number);
    }
}

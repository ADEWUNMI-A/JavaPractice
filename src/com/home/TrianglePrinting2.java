package com.home;

public class TrianglePrinting2 {
    public static void main(String[] args) {

        for(int row = 1; row <= 10; row++) {
            for(int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            for(int column = 1; column <= 11 - row; column++) {
                System.out.print(" ");
            }
            for(int column = 1; column <= 11 - row; column++) {
                System.out.print("*");
            }
            for (int column = 1; column <= row; column++) {
                System.out.print(" ");
            }
            for(int column = 1; column <= row; column++) {
                System.out.print(" ");
            }
            for(int column = 1; column <= 11 - row; column++) {
                System.out.print("*");
            }
            for(int column = 1; column <= 11 - row; column++) {
                System.out.print(" ");
            }
            for(int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

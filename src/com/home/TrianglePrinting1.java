package com.home;
//(Triangle Printing Program) Write an application that displays the following patterns separately,
// one below the other. Use for loops to generate the patterns. All asterisks (*) should be printed
// by a single statement of the form System.out.print('*'); which causes the asterisks to print side
//by side. A statement of the form System.out.println(); can be used to move to the next line. A
//statement of the form System.out.print(' '); can be used to display a space for the last two patterns.
// There should be no other output statements in the program. [Hint: The last two patterns require that
// each line begin with an appropriate number of blank spaces.]
public class TrianglePrinting1 {
    public static void main(String[] args) {
        for(int row = 1; row <= 10; row++){
           for(int column = 1; column <= row; column++){
               System.out.printf("%s %s", "*", " ");
           }
            System.out.println();
        }
        System.out.println();

        for(int row = 10; row >= 1; row--){
            for (int column = 1; column <= row; column++) {
                System.out.printf("%s %s", "*", " ");
            }
            System.out.println();
        }
        System.out.println();

       for(int row = 1; row <= 10; row++){
           for(int i = 1; i < row; i++){
               System.out.print("   ");
           }
           for(int column = 10; column >= row; column--){
               System.out.printf("%s %s", "*"," ");
           }
           System.out.println();
       }

        for(int row = 1; row <= 10; row++){
            for(int i = 10; i >= row; i--){
                System.out.print("   ");
            }
            for(int column = 1; column <= row; column++){
                System.out.printf("%s %s", "*"," ");
            }
            System.out.println();
//
    }
}}
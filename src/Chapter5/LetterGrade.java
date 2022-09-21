package Chapter5;
/* Calculates the class average of a set of user-entered numeric grades.
The program’s switch statement determines whether each grade is the equivalent of an A, B, C, D or F and increments
the appropriate grade counter. The program also displays a summary of the number of students who received each grade.
 */

import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;
        int total = 0;
        int gradeCounter = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the grade in the range of 0 to 100: ");
        while (input.hasNext()) {
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter++;

            switch (grade / 10) {
                case 10, 9, 8 -> aCount++;
                case 7 -> bCount++;
                case 6 -> cCount++;
                case 5 -> dCount++;
                default -> fCount++;
            }

        }
        double average = (double) total / gradeCounter;

        System.out.printf("%nThe total of %d grade of student is %d", gradeCounter, total);
        System.out.printf("%nThe average grade is %.2f ", average);

        System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                        "The number of student who received each grades",
                        "A: ", aCount,
                        "B: ", bCount,
                        "C: ", cCount,
                        "D: ", dCount,
                        "F: ", fCount);
        System.out.printf("The grade counter is %d", gradeCounter);
    }
}

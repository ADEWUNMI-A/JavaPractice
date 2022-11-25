package Chapter7.ArraySnacks;

import Chapter7.MinMaxSum;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many students do you have?");
        int students = sc.nextInt();
        System.out.println("How many subject do they offer?");
        int subjects = sc.nextInt();
        System.out.println("Saving >>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully");

        int[][] classScores = new int[students][subjects];
        int[] total = new int[students];
        double[] average = new double[students];
        int[] position = new int[students];


        int i;
        int j = 0;
        int highest = 0;
        for (i = 0; i <= students - 1; i++) {
            for (j = 0; j <= subjects - 1; j++) {
                System.out.printf("%nEntering Score for student %d%n", i + 1);
                System.out.printf("Enter score for subject %d%n", j + 1);
                classScores[i][j] = sc.nextInt();
                total[i] += classScores[i][j];
                average[i] = (double) total[i] / students;
                System.out.println("Saving >>>>>>>>>>>>>>>>>>>");
                System.out.println("Saved successfully");
                highest = MinMaxSum.max(classScores[subjects]);


            }
        }


        System.out.println("SUBJECT SUMMARY");
        System.out.printf("Subject %d%n", i);
        System.out.printf("Highest Scoring student is: student 1 scoring %d", highest);
    }


//    public static void displaySubjectSummary(int subjects,)
//        System.out.println(Arrays.deepToString(classScores));
//        System.out.println(Arrays.toString(total));
//        System.out.println(Arrays.toString(average));
//

//    }

}

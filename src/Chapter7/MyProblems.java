package Chapter7;

import java.util.ArrayList;
import java.util.Scanner;

public class MyProblems {
    public static void displayProblem(ArrayList<String> problemList) {
        System.out.println("BELOW ARE MY PROBLEM(S)");
        for (int index = 0; index < problemList.size(); index++) {
            System.out.printf("%d%s %s%n", index +1, "------->>>", problemList.get(index));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> problemList = new ArrayList<>();

        while (true) {
            System.out.println("Enter your problems: ");
            String wahala = sc.nextLine().toUpperCase();
            problemList.add(wahala);

            System.out.println("More problems: ");
            String moreProblems = sc.nextLine().toUpperCase();
            if (!moreProblems.equals("YES")) {
                displayProblem(problemList);
                break;
            }
        }
    }
}

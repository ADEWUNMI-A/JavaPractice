package problem_solving;

import java.util.Scanner;

public class GuessingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int date = 10;
        while (true) {
            System.out.println("Guess my birthday: ");
            int d = sc.nextInt();
            if (d == date) {
                System.out.println(("Correct guess"));
                break;
            }
            else{
                System.out.println("Incorrect guess");
            }
        }
    }
}

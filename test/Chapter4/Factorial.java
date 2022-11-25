package Chapter4;

import java.util.Scanner;

public class Factorial {
    public static long fact(int number){
        long result = 1;
        if (!(number < 0)) {
            for (int i = 1; i <= number; i++) {
                result = result * i;
            }
        }
        return result;
    }

    public static double doubleFact(int number) {
        double result = 0;
        for (int i = 1 ; i < number; i++) {
            double ans =  Factorial.fact(number);
            double answer = 1 / ans;
             result = 1 + Math.round(number);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        System.out.println(Factorial.fact(number));
        System.out.println(Factorial.doubleFact(number));
    }
}

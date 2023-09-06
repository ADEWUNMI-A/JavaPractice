package problem_solving;

public class SumOfNumberDivisibleBy3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;
        for (int number : numbers) {
            if (numbers[number - 1] % 3 == 0) {
                total += numbers[number - 1];
            }
        }
            System.out.println((total));

    }

}

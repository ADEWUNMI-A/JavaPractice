package Chapter7.ClassPractice;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.printf((numbers[i]) + ", ");
        }
//        System.out.println(Arrays.toString(numbers) + " ");
//        Arrays.stream(numbers).parallel().forEach(number->System.out.printf("%n%s",number + " "));

    }
}

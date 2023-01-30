package Chapter16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ExampleOne {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
//        numbers.add(10);

        Integer[] numberArray = new Integer[3];
        numbers.toArray(numberArray);
        System.out.println(Arrays.toString(numberArray));
    }

}

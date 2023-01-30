package Chapter16.list;

import java.util.*;

public class Example3 implements Comparator<Integer> {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(3);

        System.out.println("before sorting:: " +numbers);

        Comparator<Integer> comparator = (a, b) -> b - a;

        numbers.sort(Comparator.naturalOrder());
        System.out.println("Sorting to natural order:: " +numbers);

        numbers.sort(Comparator.reverseOrder());
        System.out.println("Sorting to reversed order:: " +numbers);

//        System.out.println(set);

    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return 0;
    }
}

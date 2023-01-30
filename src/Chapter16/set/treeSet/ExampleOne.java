package Chapter16.set.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class ExampleOne {

    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(3);

        Set<Integer> set = new TreeSet<>();
        set.add(9);
        set.add(6);

        System.out.println(set);

    }
}

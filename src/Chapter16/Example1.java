package Chapter16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Example1 {

    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

//        Iterator<Integer> iterator = numbers.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        int minimum = Collections.min(numbers);
        Collections.max(numbers);

        System.out.println("Smallest:: " +minimum);
    }
}

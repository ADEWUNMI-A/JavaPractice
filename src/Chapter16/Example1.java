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
        System.out.println("Largest:: " +Collections.max(numbers));
        System.out.println();
        System.out.println("Smallest:: " +minimum);


        Collection<Integer> newNumbers = new ArrayList<>();
        newNumbers.add(1);
        newNumbers.add(2);
        newNumbers.add(3);



        System.out.println("Element in numbers:: " +numbers);
        System.out.println("Element in newNumbers:: " +newNumbers);
        System.out.println();
        System.out.println("adding all element in number 2 to numbers:: " +numbers.addAll(newNumbers));


        Iterator<Integer> numb = numbers.iterator();


    }
}

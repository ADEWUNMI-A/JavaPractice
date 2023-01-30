package Chapter16.list;

import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(10);

//        System.out.println("index of element 3 in numbers:: " +numbers.indexOf(3));

        ListIterator<Integer> numberIterator = numbers.listIterator(2);

        while(numberIterator.hasPrevious()) {
            System.out.println(numberIterator.previous());
            numberIterator.remove();
//            System.out.println(numbers);
        }
        System.out.println(numbers);



//        Collection<Integer> list = new Vector<>();
//        list.add(1);
//        list.add(2);
//
//        System.out.println(numbers.containsAll(list));
//        System.out.println("Element at index 2 of numbers-> " +numbers.get(2));
//        System.out.println("Element at index 2 of numbers-> " +numbers.set(1,5));
//        System.out.println("number:: " +numbers);
//        numbers.clear();
//        System.out.println("number:: " +numbers);


    }
}

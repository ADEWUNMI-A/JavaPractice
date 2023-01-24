package Chapter16;

import java.util.ArrayList;
import java.util.List;

public class Example {

    public static void main(String[] args) {
//        List<String> words = new ArrayList<>();
//        words.add("Semicolon");
//        words.add("Batified");
//        words.add("Obidients");
//        words.add("Atikulate");

        List<Integer> numbers =new ArrayList<>();
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);


        int number = numbers.get(2);
        System.out.println(number);
        System.out.println(numbers);

    }
}

package Chapter16.set.hashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example1 {

    public static void main(String[] args) {
        Set<String> states = new HashSet<>();
        states.add("Abia");
        states.add("Bauchi");
        states.add("Zamfara");
        states.add("Borno");

        System.out.println("States:: "+states);

    }
}

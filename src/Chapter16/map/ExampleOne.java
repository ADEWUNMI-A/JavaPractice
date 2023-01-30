package Chapter16.map;

import java.util.Map;

public class ExampleOne {

    public static void main(String[] args) {

        Map<String, Integer> calendar = Map.of(
                "January", 31,
                "February", 28,
                "March", 31,
                "April", 30,
                "May", 31,
                "June", 30
        );
        calendar.put("July", 31);// cannot be mutated
        System.out.println();
    }
}

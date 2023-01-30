package Chapter17.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Example6 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(100, 5, 3, 2, 15, 3, -1, 8, 0, 8, 99, 98, 100);
        System.out.println(numbers.stream()
                                  .distinct()
                                  .collect(Collectors.toList()));
    }

}

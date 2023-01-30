package Chapter17.streams;

import java.util.Random;
import java.util.stream.Stream;

public class ExampleTwo {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(n -> System.out.print(n));

        Stream<Integer> emptyStream = Stream.empty();
        System.out.println(emptyStream);

//        Stream<Integer> nums = Stream.generate(() -> new Random().nextInt(10));
//        nums.forEach((n) -> System.out.println(n));
    }
}

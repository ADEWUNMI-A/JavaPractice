package Chapter17.streams;

import java.util.List;

public class Example9 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        System.out.println(numbers.stream()

                .reduce((x, y) -> x *
                        y).orElse(0)); //Performs a reduction on the elements of this stream,
                                                            // using an associative accumulation function,
                                                        // and returns an Optional describing the reduced value, if any.
//                        .reduce(-1,(x, y) -> x + y));

    }
}

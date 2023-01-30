package Chapter17.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Example7 {

    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 22, 2, 4, 6, 3, 4, 21, 56, 34, 3, 2, 1);
        System.out.println("Before:: " +nums);
        System.out.println("After1::" + nums.stream().distinct().sorted().toList());
        System.out.println("After::" + nums.stream().distinct().sorted());

    }
}

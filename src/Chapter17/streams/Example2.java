package Chapter17.streams;

import Chapter16.queue.Person;
import Chapter3.HealthRecord;

import java.util.Arrays;
import java.util.stream.Collectors;
import static Chapter16.queue.Person.Gender.FEMALE;

public class Example2 {

    public static void main(String[] args) {
        int[] numbers = {10,11,12,13,14,15};
        System.out.println(Arrays.stream(numbers)
                .mapToObj(element -> buildPerson(element))
                    .collect(Collectors.toList()));


    }

    private static Object buildPerson(int age) {
        Person person = new Person("Amirah", age, FEMALE);
        return  person;
    }
}
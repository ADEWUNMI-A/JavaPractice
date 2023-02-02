package Chapter17.streams;

import java.util.Set;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        Set<Employee> employees = Set.of(
                new Employee("Amirah", 50),
                new Employee("Amara", 30),
                new Employee("Wunmi", 40)
        );
        System.out.println(employees);
        System.out.println(employees.stream()
                .sorted()
                .collect(Collectors.toList())
        );
    }
}

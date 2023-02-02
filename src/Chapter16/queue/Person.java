package Chapter16.queue;

import Chapter3.HealthRecord;

import java.util.Comparator;

public class Person implements Comparator<Person> {
    private String firstName;
    private int age;
    public enum Gender{MALE, FEMALE};

    public Person(String firstName, int age, Gender gender) {
        this.firstName = firstName;
        this.age = age;
    }
    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compare(Person firstPerson, Person secondPerson) {
        return firstPerson.getAge() - secondPerson.getAge();
    }
}

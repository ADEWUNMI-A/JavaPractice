package Chapter3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Scanner;

public class ClockTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Clock clock = new Clock(23,59,59);

        System.out.printf("%d:%d:%d%n%n", clock.getHour(), clock.getMinute(), clock.getSecond());

        System.out.print("Enter the hour: ");
        int hour = input.nextInt();
        clock.setHour(hour);

        System.out.print("Enter the minute: ");
        int minute = input.nextInt();
        clock.setMinute(minute);

        System.out.print("Enter the second: ");
        int second = input.nextInt();
        clock.setSecond(second);

        System.out.printf("The time is  %d:%d:%d", clock.getHour(), clock.getMinute(), clock.getSecond());
    }

}
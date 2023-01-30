package Chapter16.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Example1 {
    public static void main(String[] args) {
        Queue<String> fillingStations = new PriorityQueue<>();
        fillingStations.offer("Toyota");
        fillingStations.offer("Honda");
        fillingStations.offer("Peugeot");

        System.out.println(fillingStations.peek());
        System.out.println(fillingStations);

    }
}

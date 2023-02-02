package Chapter16.binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
        String [] colors = {"yellow", "blue", "red", "green", "cyan", "white", "lemon", "teal", "black", "pink"};
        List<String> list = new ArrayList<>(List.of(colors));
        Collections.sort(list);

        System.out.println(list);

        int result = Collections.binarySearch(list,"yellow");
        System.out.println(result);

        String [] colors2 = {"lemon", "indigo", "black", "pink"};
        List<String> list2 = new ArrayList<>(List.of(colors2));

        list2.addAll(list);
        System.out.println(list2);

        Collections.sort(list2);
        System.out.println(list2);

        boolean result2 = Collections.disjoint(list, list2);
        System.out.printf("list and list2 %s colour(s) in common",result2 ? "does not have" : "have");
    }

}

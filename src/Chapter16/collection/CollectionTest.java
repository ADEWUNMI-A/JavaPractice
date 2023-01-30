package Chapter16.collection;

import java.util.*;

public class CollectionTest {

    public static void main(String[] args) {
        String [] colors = {"blue", "green","brown", "lemon", "orange", "white", "red"};
        List<String> colorList = new ArrayList<>();

//        colorList.addAll(Arrays.asList(colors));
        Collections.addAll(colorList, colors);
        System.out.println(colorList);

        String [] removeList = {"brown", "lemon", "orange"};
        List<String> removeColor = new ArrayList<>();
        removeColor.addAll(Arrays.asList(removeList));
        System.out.println(colorList);

        removeColors(colorList,removeColor);
        System.out.println(colorList);


    }

    private static void removeColors(Collection<String> initialList, Collection<String> listToRemove) {

        Iterator<String> iterator = initialList.iterator();

        while(iterator.hasNext()) {
            if (listToRemove.contains(iterator.next())) {
                iterator.remove();
            }
        }
    }
}

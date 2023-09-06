package Chapter7.ArraySnacks;

import java.util.ArrayList;
import java.util.Arrays;

public class ConcatenateArray {

    public static ArrayList<String> concatenateArray(String[] firstValue, String[] secondValue) {
        ArrayList<String> concat = new ArrayList<>();
        for (int i = 0; i < secondValue.length; i++) {
            concat.add(i, String.valueOf(secondValue[i]));
            concat.add(firstValue[i]);
        }
        return concat;
    }

    public static String[] combiningArray(String[] firstValue, String[] secondValue) {
        String[] combine = new String[secondValue.length];
        for (int i = 0; i < secondValue.length; i++) {
            combine[i] = firstValue[i] + secondValue[i];
        }
        return combine;
    }


    public static void main(String[] args) {
        String[] letters = {"a", "b", "c"};
        String[] numbers = {"1", "2", "3" };
        System.out.println(Arrays.toString(combiningArray(letters, numbers)));
        System.out.println(concatenateArray(numbers,letters));
    }
}

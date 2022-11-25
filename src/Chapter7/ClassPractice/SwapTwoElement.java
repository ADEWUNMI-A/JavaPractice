package Chapter7.ClassPractice;

import java.util.Arrays;

public class SwapTwoElement {


        public static String[] swap(String[] letters){
            String temp = letters[0];
            letters[0] = letters[1];
            letters[1] = temp;
            return letters;
        }

    public static void main(String[] args) {
        String[] letters = {"a","b","c"};
        System.out.println(Arrays.toString(swap(letters)));
    }
    }


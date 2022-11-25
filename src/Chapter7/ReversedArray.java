package Chapter7;

public class ReversedArray {
    public static int[] reverse(int[] array) {
        int[] revArray = new int[array.length];
        int forwardCounter = 0;
        for (int backwardCounter = array.length - 1; backwardCounter >= 0; backwardCounter--) {
            revArray[forwardCounter] = array[backwardCounter];
            forwardCounter++;
        }
        return revArray;
    }
    public static String reverse(String userString) {
        String reversedString = "";
        int backwardCounter = userString.length() - 1;
        while (backwardCounter >= 0) {
            reversedString += userString.charAt(backwardCounter--);
        }
        return reversedString;
    }
    public static String capitalize(String userInput) {
        String otherLetters = "";
        String firstLetter = "";
        for (int counter = 0; counter <= userInput.length() - 1; counter++) {
            if (counter == 0) {
                firstLetter = String.valueOf(userInput.charAt(0));
                firstLetter = firstLetter.toUpperCase();
            } else
                otherLetters += userInput.charAt(counter);
        }
        System.out.println(firstLetter + otherLetters);
        return firstLetter + otherLetters.toLowerCase();
    }


    public static void main(String[] args) {
        int[] numbers = {9, 5, 4, 10, 7, 8, 3};
        int[] newNumber = reverse(numbers);
        for (int i : newNumber) {
            System.out.printf("%d%s", i, " ");
        }
        String name = "adewunmi";
        String reversedName = reverse(name);
        System.out.printf("%n%s", reversedName);
    }
}


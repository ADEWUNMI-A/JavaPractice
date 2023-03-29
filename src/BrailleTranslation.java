import java.util.Arrays;
import java.util.Scanner;

public class BrailleTranslation {

    public String charToBraille(String letter) {
        String[][] brailleLetter = new String[2][3];
        for (String[] strings : brailleLetter) {
            Arrays.fill(strings, "*");
        }
        String output = Arrays.deepToString(brailleLetter);
        if (output.length() > 2) {
            System.out.println();
        }
        String brailleForm = "";
        switch (letter.toLowerCase()) {
            case "a" -> brailleForm = brailleLetter[0][0];
            case "b" -> brailleForm = brailleLetter[0][0] + brailleLetter[0][1];
            case "c" -> brailleForm = brailleLetter[0][0] + brailleLetter[0][1] + "\n " + brailleLetter[1][1];
            case "d" -> brailleForm = brailleLetter[0][0] + brailleLetter[0][1] + "\n" + brailleLetter[1][0];
        }
        return brailleForm;
    }

    private String stringToBraille(String word) {
        StringBuilder brailleWord = new StringBuilder();
        for(int i = 0; i < word.length(); i++) {
            brailleWord.append(charToBraille(String.valueOf(word.charAt(i)))).append(" ");
        }
        return brailleWord.toString();
    }

    public static void main(String[] args) {
        BrailleTranslation brailleTranslation = new BrailleTranslation();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a letter to change it to braille: ");
        String userInput = "";
        while (!userInput.equals("quit")) {
            userInput = sc.nextLine().toLowerCase();
            System.out.println(brailleTranslation.stringToBraille(userInput));
//            System.out.println(userInput);

        }
    }
}

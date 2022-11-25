package Chapter7.ClassPractice;

public class DigitCounter {

    public static int countDigit(String text) {
        int numberOfDigit = 0;
        for (int i = 0; i < text.length(); i++) {
            if(Character.isDigit(text.charAt(i)))
                numberOfDigit++;
        }
        return numberOfDigit;
    }
}

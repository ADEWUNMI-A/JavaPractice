package Chapter7;

public class ReversedString {

    public static String reverse(String userString) {
        String reversedString = "";
        int backwardCounter = userString.length() - 1;
        while (backwardCounter >= 0) {
            reversedString += userString.charAt(backwardCounter--);
        }
        return reversedString;
    }

    public static void main(String[] args) {
        System.out.println(reverse("semicolon"));
    }
}

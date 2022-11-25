package Chapter7.ArraySnacks;

import java.util.Scanner;

public class Palindrome {

    public static void palindrome(String userInput) {
        String reversedString = "";
        int backwardCounter = userInput.length() - 1;
        while (backwardCounter >= 0) {
            reversedString += userInput.charAt(backwardCounter--);
        }
        if (reversedString.equalsIgnoreCase(userInput)) {
            System.out.println("It is a palindrome");
        }
        else System.out.println("It is not a  palindrome");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = sc.nextLine();
        palindrome(string);

    }
}

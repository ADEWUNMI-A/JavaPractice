import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int [] number = {1, 2, 3, 4, 5};
        int [] revNumber = new int[number.length];
        int forwardCounter = 0;
        for (int backwardCounter = number.length - 1; backwardCounter >= 0; backwardCounter--) {
            revNumber[forwardCounter] = number[backwardCounter];
            forwardCounter++;
        }
            System.out.println(Arrays.toString(revNumber));
        }
    }


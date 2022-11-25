package Chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LargestSmallestOfSumTest {
    LargestSmallestOfSum largestSmallestOfSum;

    @BeforeEach
    void startAllObjectWith() {
        largestSmallestOfSum = new LargestSmallestOfSum();
    }

    @Test
    void minimumOfArray() {
        int[] numbers = {3, 4, 5, 6, 1};
        assertEquals(1, largestSmallestOfSum.minimumOf(numbers));
    }

    @Test
    void maximumOfArray() {
        int[] numbers = {3, 4, 5, 6, 1};
        assertEquals(6, largestSmallestOfSum.maximumOf(numbers));
    }


    @Test
    void sumOfArray() {
        int[] numbers = {3, 4, 5, 6, 1};
        assertEquals(19, largestSmallestOfSum.sumOf(numbers));
    }
}



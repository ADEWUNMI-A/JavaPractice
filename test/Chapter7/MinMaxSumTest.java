package Chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxSumTest {
    MinMaxSum minMaxSum;

    @BeforeEach
        void startAllTestWith() {
        minMaxSum = new MinMaxSum();
    }

    @Test
    void sum() {
        int[] number = {5,3,4,2,1};
        assertEquals(15, MinMaxSum.sum(number));
    }

    @Test
    void min() {
        int[] number = {5,3,4,2,1};
        assertEquals(1, MinMaxSum.min(number));
    }

    @Test
    void max() {
        int[] number = {5,3,4,2,1};
        assertEquals(5, MinMaxSum.max(number));
    }
}
package Chapter7.ClassPractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitCounterTest {

    @Test
    public void countDigitTest() {
        DigitCounter digitCounter = new DigitCounter();
        assertEquals(5, DigitCounter.countDigit("ghj7high9guubvf6f45"));
    }

}
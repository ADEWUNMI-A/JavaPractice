package Chapter8.HugeIntegerPackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

public class HugeIntegerTest {
    private HugeInteger hugeInteger;

    @BeforeEach
    void setUp() {
        hugeInteger = new HugeInteger(4);
    }

    @Test
    void objectExistTest() {
        assertNotNull(hugeInteger);
    }

    @Test
    void parseTest() {
        hugeInteger.parse("1345");
        assertEquals(BigInteger.valueOf(1345), hugeInteger.newNumber());
    }

    @Test
    void sumOfTwoStringTest() {
        HugeInteger num1 = new HugeInteger(12);
        HugeInteger num2 = new HugeInteger(58);
        HugeInteger sum = hugeInteger.addNum(num1,num2);
        assertEquals(70, sum.toInt());
    }

    @Test
    void subtractTwoStringTest() {
        HugeInteger num1 = new HugeInteger(1);
        HugeInteger num2 = new HugeInteger(8);
        HugeInteger minus = hugeInteger.subtractNum(num1, num2);
        assertEquals(7, minus.toInt());
    }

    @Test
    void isEqualToTest() {
        HugeInteger num1 = new HugeInteger(8);
        HugeInteger num2 = new HugeInteger(8);
        assertTrue(hugeInteger.isEqualTo(num1, num2));
    }

    @Test
    void isNotEqualToTest() {
        HugeInteger num1 = new HugeInteger(7);
        HugeInteger num2 = new HugeInteger(10);
        assertTrue(hugeInteger.isNotEqualTo(num1, num2));
    }

    @Test
    void isGreaterThanTest() {
        HugeInteger comparator1 = new HugeInteger(19);
        HugeInteger comparator2 = new HugeInteger(10);
        assertTrue(hugeInteger.isGreaterThan(comparator1, comparator2));
    }

    @Test
    void isLessThanTest() {
        HugeInteger comparator1 = new HugeInteger(1);
        HugeInteger comparator2 = new HugeInteger(10);
        assertTrue(hugeInteger.isLessThan(comparator1, comparator2));
    }

    @Test
    void isGreaterThanOrEqualToTest() {
        HugeInteger comparator1 = new HugeInteger(19);
        HugeInteger comparator2 = new HugeInteger(10);
        assertTrue(hugeInteger.isGreaterThanOrEqualTo(comparator1, comparator2));
    }

    @Test
    void isLessThanOrEqualToTest() {
        HugeInteger comparator1 = new HugeInteger(1);
        HugeInteger comparator2 = new HugeInteger(1);
        assertTrue(hugeInteger.isLessThanOrEqualTo(comparator1, comparator2));
    }

    @Test
    void isZeroTest() {
        HugeInteger comparator1 = new HugeInteger(0);
        assertTrue(hugeInteger.isZero(comparator1));
    }

    @Test
    void multiplyTest() {
        HugeInteger num1 = new HugeInteger(8);
        HugeInteger num2 = new HugeInteger(8);
        HugeInteger times = hugeInteger.multiply(num1, num2);
        assertEquals(64, times.toInt());
    }

    @Test
    void remainderTest() {
        HugeInteger num1 = new HugeInteger(5);
        HugeInteger num2 = new HugeInteger(8);
        HugeInteger result = hugeInteger.remainder(num1, num2);
        assertEquals(5, result.toInt());
    }

}




















package Chapter4;

import static org.junit.jupiter.api.Assertions.*;

class CreditLimitCalculatorTest {
    public static void main(String[] args) {
        CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator(1234567891,5690,
                25900,456,563);
        System.out.println(creditLimitCalculator.setBalance(4,10,5));
    }
}
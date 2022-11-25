package Chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class TaxCalculatorTest {
    private TaxCalculator calculator;
    private Citizen mathias;
    private Citizen dewunmi;
    private Citizen deola;

  @BeforeEach
    void setUp() {
        mathias = new Citizen();
        mathias.setFirstName("Mathias ");
        mathias.setSurname("Momodu");
        BigDecimal salary = new BigDecimal(17000);
        mathias.setEarning(salary);

        dewunmi = new Citizen("Adewunmi","Adegunwa");
         salary= new BigDecimal(25000);
        dewunmi.setEarning (salary);

        deola = new Citizen("Adeola","Adekunle");
         salary = new BigDecimal(45000);
        deola.setEarning(salary);
    }

    @Test
    void calculateTax() {
        BigDecimal mathiasTax = TaxCalculator.calculateTax(mathias);
        assertEquals(2550.00, mathiasTax.intValue());

        BigDecimal wunmiTax = TaxCalculator.calculateTax(mathias);
        assertEquals(3750.00, wunmiTax.intValue());
    }
    @Test
    void calculateExcessTax() {
        BigDecimal deolaTax = TaxCalculator.calculateTax(deola);
        assertEquals(7500, deolaTax.intValue());
    }

}

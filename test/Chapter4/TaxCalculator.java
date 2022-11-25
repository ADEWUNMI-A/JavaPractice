package Chapter4;

import java.math.BigDecimal;

public class TaxCalculator {
    private static final BigDecimal MINIMUM_EARNING = BigDecimal.valueOf(30000);
    private static final double BASE_TAX_RATE = 0.15;
    private static final double ADDITIONAL_TAX_RATE = 0.20;

    public static BigDecimal calculateTax(Citizen citizen) {
        BigDecimal taxAmount = BigDecimal.ZERO;
        if(citizen.getEarning().compareTo(MINIMUM_EARNING) < 1){
            taxAmount = citizen.getEarning().multiply(BigDecimal.valueOf(BASE_TAX_RATE));
        }
        else {
            BigDecimal baseTax = MINIMUM_EARNING.multiply(BigDecimal.valueOf(BASE_TAX_RATE));
            BigDecimal excessAmount = citizen.getEarning().subtract(MINIMUM_EARNING);
            BigDecimal additionalTax = excessAmount.multiply(BigDecimal.valueOf(ADDITIONAL_TAX_RATE));
            taxAmount = baseTax.add(additionalTax);
        }

        return taxAmount;
    }


}

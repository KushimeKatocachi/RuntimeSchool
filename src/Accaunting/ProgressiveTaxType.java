package Accaunting;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal taxRate;
        if (amount.compareTo(new BigDecimal(100000)) <= 0) {
            taxRate = new BigDecimal(0.10);
        } else {
            taxRate = new BigDecimal(0.15);
        }
        return amount.multiply(taxRate);
    }
}

package Accaunting;

import java.math.BigDecimal;

public class IncomeTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal taxRate = new BigDecimal("0.13");
        return amount.multiply(taxRate);
    }
}

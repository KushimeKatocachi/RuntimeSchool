package Accaunting;

import java.math.BigDecimal;

public class VATaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal taxRate = new BigDecimal("0.18");
        return amount.multiply(taxRate);
    }
}

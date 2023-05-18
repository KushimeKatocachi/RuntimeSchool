package Accaunting;

import java.math.BigDecimal;

public class TaxServise {
    public void payOut(BigDecimal taxAmount) {
        System.out.format("Уплачен налог в размере %.2f%n", taxAmount);
    }

}

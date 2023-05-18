package Accaunting;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        TaxServise taxService = new TaxServise();
        Bill[] payments = new Bill[] {
                new Bill(new BigDecimal(100000), new IncomeTaxType(), taxService),
                new Bill(new BigDecimal(100000), new VATaxType(), taxService),
                new Bill(new BigDecimal(150000), new ProgressiveTaxType(), taxService)
        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}

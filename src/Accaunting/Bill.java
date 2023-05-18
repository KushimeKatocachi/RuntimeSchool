package Accaunting;

import java.math.BigDecimal;

public class Bill {
        private BigDecimal amount;
        private TaxType taxType;
        private TaxServise taxService;

        public Bill(BigDecimal amount, TaxType taxType, TaxServise taxService) {
            this.amount = amount;
            this.taxType = taxType;
            this.taxService = taxService;
        }

        public void payTaxes() {
            BigDecimal taxAmount = taxType.calculateTaxFor(amount);
            taxService.payOut(taxAmount);
        }
    }


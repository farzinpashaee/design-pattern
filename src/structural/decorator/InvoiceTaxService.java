package structural.decorator;

import java.math.BigDecimal;

public class InvoiceTaxService extends InvoiceServiceDecorator {

    public InvoiceTaxService(InvoiceService invoiceService) {
        super(invoiceService);
    }

    @Override
    public BigDecimal getTotalAmount() {
        return calculateTax(super.getTotalAmount());
    }

    public BigDecimal calculateTax(BigDecimal totalAmount ){
        BigDecimal rate = totalAmount.multiply( new BigDecimal(0.2) );
        return totalAmount.add(rate);
    }

}

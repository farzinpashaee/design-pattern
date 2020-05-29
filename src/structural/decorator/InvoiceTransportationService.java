package structural.decorator;

import java.math.BigDecimal;

public class InvoiceTransportationService extends InvoiceServiceDecorator {

    public InvoiceTransportationService(InvoiceService invoiceService) {
        super(invoiceService);
    }

    @Override
    public BigDecimal getTotalAmount() {
        return calculateTransportation(super.getTotalAmount());
    }

    public BigDecimal calculateTransportation(BigDecimal totalAmount ){
        BigDecimal rate = totalAmount.multiply( new BigDecimal(0.3) );
        return totalAmount.add(rate);
    }
}

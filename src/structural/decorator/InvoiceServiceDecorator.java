package structural.decorator;

import java.math.BigDecimal;

public class InvoiceServiceDecorator implements InvoiceService {

    InvoiceService invoiceService;

    public InvoiceServiceDecorator(InvoiceService invoiceService){
        this.invoiceService = invoiceService;
    }

    @Override
    public BigDecimal getTotalAmount() {
        return invoiceService.getTotalAmount();
    }
}

package structural.decorator;

import java.math.BigDecimal;

public class InvoiceServiceImp implements InvoiceService {

    @Override
    public BigDecimal getTotalAmount() {
        return new BigDecimal(100);
    }

}

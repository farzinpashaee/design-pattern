package structural.adapter;

import java.math.BigDecimal;

public class CurrentAccount implements Account {
    @Override
    public BigDecimal getBalance() {
        return new BigDecimal(100);
    }

    @Override
    public BigDecimal calculateWage() {
        return new BigDecimal(5);
    }
}

package structural.adapter;

import java.math.BigDecimal;

public class InvestmentAccount implements Account {
    @Override
    public BigDecimal getBalance() {
        return new BigDecimal(10000);
    }

    @Override
    public BigDecimal calculateWage() {
        return new BigDecimal(120);
    }
}

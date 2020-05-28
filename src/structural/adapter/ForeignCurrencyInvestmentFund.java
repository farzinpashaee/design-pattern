package structural.adapter;

import java.math.BigDecimal;

public class ForeignCurrencyInvestmentFund implements InvestmentFund {

    @Override
    public BigDecimal calculateWage() {
        return new BigDecimal(400);
    }

    @Override
    public BigDecimal calculateMarketValue() {
        return new BigDecimal(50);
    }
}

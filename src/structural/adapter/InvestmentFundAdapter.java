package structural.adapter;

import java.math.BigDecimal;

public class InvestmentFundAdapter implements Account {

    InvestmentFund investmentFund;

    public InvestmentFundAdapter(InvestmentFund investmentFund){
        this.investmentFund = investmentFund;
    }

    @Override
    public BigDecimal getBalance() {
        return investmentFund.calculateMarketValue();
    }

    @Override
    public BigDecimal calculateWage() {
        return investmentFund.calculateWage();
    }
}

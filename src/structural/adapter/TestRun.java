package structural.adapter;

public class TestRun {

    public static void main(String[] args) {

        InvestmentFund investFund = new ForeignCurrencyInvestmentFund();
        AccountingService accountingService = new AccountingService(new InvestmentFundAdapter(investFund));
        System.out.println(accountingService.currentValue());

    }
}

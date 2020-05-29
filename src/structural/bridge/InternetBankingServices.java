package structural.bridge;

import java.math.BigDecimal;

public class InternetBankingServices implements OnlineServices {

    AccountService accountService;

    InternetBankingServices(AccountService accountService){
        this.accountService = accountService;
    }

    @Override
    public void payBill(String accountNumber, String billId) {
        System.out.println("processing bill " + billId );
        accountService.withdraw(accountNumber,new BigDecimal(120));
    }
}

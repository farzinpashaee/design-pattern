package structural.bridge;

import java.math.BigDecimal;

public class ForeignCurrencyAccountService implements AccountService {
    @Override
    public void deposit(String accountNumber, BigDecimal amount) {
        System.out.println("ForeignCurrencyAccountService deposit : " + amount);
    }

    @Override
    public void withdraw(String accountNumber, BigDecimal amount) {
        System.out.println("ForeignCurrencyAccountService deposit : " + amount);
    }
}

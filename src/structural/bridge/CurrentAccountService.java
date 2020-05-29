package structural.bridge;

import java.math.BigDecimal;

public class CurrentAccountService implements AccountService {
    @Override
    public void deposit(String accountNumber, BigDecimal amount) {
        System.out.println("CurrentAccountService deposit : " + amount);
    }

    @Override
    public void withdraw(String accountNumber, BigDecimal amount) {
        System.out.println("CurrentAccountService withdraw : " + amount);
    }
}

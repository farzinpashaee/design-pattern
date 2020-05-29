package structural.bridge;

import java.math.BigDecimal;

public interface AccountService {

    public void deposit(String accountNumber, BigDecimal amount);
    public void withdraw(String accountNumber, BigDecimal amount);

}

package structural.adapter;

import java.math.BigDecimal;

public class AccountingService {

    Account account;

    public AccountingService( Account account ){
        this.account = account;
    }

    public BigDecimal currentValue(){
        return account.getBalance().add( account.calculateWage() );
    }

}

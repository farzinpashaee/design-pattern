package behavioural.mediator;

import java.math.BigDecimal;

public class AccountingService {

    ServiceMediator serviceMediator;

    public AccountingService( ServiceMediator serviceMediator ){
        this.serviceMediator = serviceMediator;
    }

    public BigDecimal calculateAssets(){
        int stock = serviceMediator.getStockNumber();
        return new BigDecimal(10).multiply(new BigDecimal(stock));
    }

}

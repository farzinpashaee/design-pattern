package behavioural.mediator;

public class InventoryService implements BusinessService {
    ServiceMediator serviceMediator;

    public InventoryService( ServiceMediator serviceMediator ){
        this.serviceMediator = serviceMediator;
    }


    public int getStockNumber(){
        return 10;
    }

}

package behavioural.mediator;

public class StoreServiceMediator implements ServiceMediator {

    InventoryService inventoryService;
    AccountingService accountingService;

    public void registerInventory( InventoryService inventoryService ){
        this.inventoryService = inventoryService;
    }

    public void registerAccounting( AccountingService accountingService ){
        this.accountingService = accountingService;
    }

    @Override
    public int getStockNumber() {
        return inventoryService.getStockNumber();
    }
}

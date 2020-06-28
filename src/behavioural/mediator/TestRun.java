package behavioural.mediator;

public class TestRun {

    public static void main(String[] args) {

        StoreServiceMediator storeServiceMediator = new StoreServiceMediator();
        AccountingService accountingService = new AccountingService(storeServiceMediator);
        InventoryService inventoryService = new InventoryService(storeServiceMediator);

        storeServiceMediator.registerAccounting(accountingService);
        storeServiceMediator.registerInventory(inventoryService);

        System.out.println( accountingService.calculateAssets());

    }
}

package structural.facade;

public class OrderFacade {

    public String processOrder(String orderId){

        WarehouseService warehouseService = new WarehouseService();
        if(warehouseService.checkInventory(orderId)>0){
            DeliveryService deliveryService = new DeliveryService();
            return deliveryService.processDelivery(orderId);
        }
        return "Failed";
    }

}

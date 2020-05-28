package structural.composite;

public class TestRun {

    public static void main(String[] args) {

        Product product = new AirplaneTicket();
        System.out.println(product.getCost());

        Product product1 = new TravelPackage(
            new AirplaneTicket(),
            new HotelReservation()
        );
        System.out.println(product1.getCost());

    }
}

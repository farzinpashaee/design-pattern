package structural.facade;

public class TestRun {


    public static void main(String[] args) {

        OrderFacade orderFacade = new OrderFacade();
        System.out.println( orderFacade.processOrder("1111") );

    }



}

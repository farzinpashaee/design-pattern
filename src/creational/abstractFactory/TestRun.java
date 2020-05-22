package creational.abstractFactory;

public class TestRun {

    public static void main(String[] args) {

        System.out.println( new BillGenerator( new DomesticTransportCalculatorFactory()).prepareBill(1,1));
        System.out.println( new BillGenerator( new InternationalTransportCalculatorFactory()).prepareBill(1,1));

    }
}

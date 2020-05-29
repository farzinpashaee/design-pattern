package structural.decorator;

public class TestRun {

    public static void main(String[] args) {

        InvoiceService service = new InvoiceServiceDecorator(
                new InvoiceTaxService(
                        new InvoiceTransportationService(
                                new InvoiceServiceImp()
                        )
                )
        );

        System.out.println(service.getTotalAmount());

    }

}

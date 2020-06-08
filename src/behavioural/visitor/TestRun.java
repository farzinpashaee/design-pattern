package behavioural.visitor;

public class TestRun {

    public static void main(String[] args) {

        XmlInvoiceVisitor xmlInvoiceVisitor = new XmlInvoiceVisitor();
        System.out.println( xmlInvoiceVisitor.getInvoice(new TrainTicket()) );

        System.out.println( xmlInvoiceVisitor.getInvoice(new AirplaneTicket()) );

    }

}

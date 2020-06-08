package behavioural.visitor;

public class XmlInvoiceVisitor implements Visitor {

    public String getInvoice(Ticket ticket){
        StringBuilder output = new StringBuilder();
        output.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
        output.append(ticket.accept(this)).append("\n");
        return output.toString();
    }

    @Override
    public String visitAirplaneTicket(AirplaneTicket airplaneTicket) {
        return "<flight><price>"+airplaneTicket.getPrice()+"</price></flight>";
    }

    @Override
    public String visitTrainTicket(TrainTicket trainTicket) {
        return "<train><price>"+trainTicket.getPrice()+"</price></train>";
    }
}

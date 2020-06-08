package behavioural.visitor;

public interface Visitor {

    public String visitAirplaneTicket(AirplaneTicket airplaneTicket);
    public String visitTrainTicket(TrainTicket trainTicket);

}

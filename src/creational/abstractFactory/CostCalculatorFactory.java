package creational.abstractFactory;

public interface CostCalculatorFactory {
    AirTransport getAirTransportCost();
    RoadTransport getRoadTransport();
}

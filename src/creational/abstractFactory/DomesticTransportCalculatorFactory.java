package creational.abstractFactory;

public class DomesticTransportCalculatorFactory implements CostCalculatorFactory{
    @Override
    public AirTransport getAirTransportCost() {
        return new DomesticAirTransport();
    }

    @Override
    public RoadTransport getRoadTransport() {
        return new DomesticRoadTransport();
    }
}

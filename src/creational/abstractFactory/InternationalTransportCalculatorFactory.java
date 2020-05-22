package creational.abstractFactory;

public class InternationalTransportCalculatorFactory implements CostCalculatorFactory {
    @Override
    public AirTransport getAirTransportCost() {
        return new InternationalAirTransport();
    }

    @Override
    public RoadTransport getRoadTransport() {
        return new InternationalRoadTransport();
    }
}

package creational.abstractFactory;

public class DomesticAirTransport implements AirTransport {
    @Override
    public long cost(int weight, int distance) {
        return 200;
    }
}

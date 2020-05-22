package creational.abstractFactory;

public class InternationalAirTransport implements AirTransport {
    @Override
    public long cost(int weight, int distance) {
        return 400;
    }
}

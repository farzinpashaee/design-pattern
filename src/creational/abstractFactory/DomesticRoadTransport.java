package creational.abstractFactory;

public class DomesticRoadTransport implements RoadTransport {
    @Override
    public long cost(int weight, int distance) {
        return 50;
    }
}

package creational.abstractFactory;

public class InternationalRoadTransport implements RoadTransport {
    @Override
    public long cost(int weight, int distance) {
        return 90;
    }
}

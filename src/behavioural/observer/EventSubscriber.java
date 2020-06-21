package behavioural.observer;

public interface EventSubscriber<T> {
    public void update(T t);
}

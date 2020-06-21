package behavioural.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Publisher {

    HashMap<String, List<EventSubscriber<String>>> subscribers = new HashMap<>();

    public Publisher( String... events ){
        for(String event : events)
            subscribers.put(event,new ArrayList<>());
    }

    public void subscribe( String event , EventSubscriber<String> eventSubscriber ){
        subscribers.get(event).add(eventSubscriber);
    }

    public void unSubscribe( String event , EventSubscriber<String> eventSubscriber ){
        subscribers.get(event).remove(eventSubscriber);
    }

    public void notify(String event, String payload){
        for( EventSubscriber<String> eventSubscriber : subscribers.get(event) )
            eventSubscriber.update(payload);
    }

}

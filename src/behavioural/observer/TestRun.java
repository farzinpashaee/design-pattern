package behavioural.observer;

public class TestRun  {

    public static void main(String[] args) {

        Publisher publisher = new Publisher("UPDATE","DELETE");
        publisher.subscribe("UPDATE", s -> System.out.println("S1 UPDATE EVENT RECEIVED: " + s ));
        publisher.subscribe("UPDATE", s -> System.out.println("S2 UPDATE EVENT RECEIVED: " + s ));
        publisher.subscribe("DELETE", s -> System.out.println("S3 DELETE EVENT RECEIVED: " + s ));

        publisher.notify("UPDATE" , "{message:'object updated'}");
        publisher.notify("DELETE" , "{message:'object deleted'}");

    }

}

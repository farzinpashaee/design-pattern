package behavioural.command;

public class OrderProcessor {


    public void process( OrderCommand orderCommand ){
        orderCommand.execute();
    }

}

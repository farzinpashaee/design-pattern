package behavioural.command;

public abstract class OrderCommand {

    Order order;


    public OrderCommand(Order order){
        this.order = order;
    }

    public abstract void execute();

}

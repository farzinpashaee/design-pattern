package behavioural.command;

import java.math.BigDecimal;

public class TransportationProcessCommand extends OrderCommand {

    public TransportationProcessCommand(Order order){
        super(order);
    }

    @Override
    public void execute() {
        this.order.setTransportationCost(new BigDecimal(100));
    }
}

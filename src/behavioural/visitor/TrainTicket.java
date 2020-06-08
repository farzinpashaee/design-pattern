package behavioural.visitor;

import java.math.BigDecimal;

public class TrainTicket implements Ticket {
    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(25);
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitTrainTicket(this);
    }
}

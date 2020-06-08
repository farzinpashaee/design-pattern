package behavioural.visitor;

import java.math.BigDecimal;

public class AirplaneTicket implements Ticket {
    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(100);
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitAirplaneTicket(this);
    }
}

package behavioural.visitor;

import java.math.BigDecimal;

public interface Ticket {

    public BigDecimal getPrice();
    String accept(Visitor visitor);

}

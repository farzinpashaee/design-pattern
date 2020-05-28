package structural.composite;

import java.math.BigDecimal;

public class AirplaneTicket implements Product {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(500);
    }

}

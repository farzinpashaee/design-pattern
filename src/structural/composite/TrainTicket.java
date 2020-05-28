package structural.composite;

import java.math.BigDecimal;

public class TrainTicket implements Product {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(100);
    }
}

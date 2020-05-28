package structural.composite;

import java.math.BigDecimal;

public class HotelReservation implements Product {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(800);
    }
}

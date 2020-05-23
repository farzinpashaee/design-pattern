package creational.prototype;

import java.math.BigDecimal;

public class Flight {

    private String airline;
    private BigDecimal cost;

    public Flight(String airline, BigDecimal cost) {
        this.airline = airline;
        this.cost = cost;
    }

    public Flight(Flight flight) {
        this.airline = flight.getAirline();
        this.cost = flight.getCost();
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "airline='" + airline + '\'' +
                ", cost=" + cost +
                '}';
    }
}

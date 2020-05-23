package creational.prototype;

import java.math.BigDecimal;

public class Hotel {

    private String name;
    private BigDecimal cost;
    private Integer days;

    public Hotel(String name, BigDecimal cost, Integer days) {
        this.name = name;
        this.cost = cost;
        this.days = days;
    }

    public Hotel(Hotel hotel) {
        this.name = hotel.getName();
        this.cost = hotel.getCost();
        this.days = hotel.getDays();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", days=" + days +
                '}';
    }
}

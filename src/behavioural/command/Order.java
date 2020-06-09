package behavioural.command;

import structural.flyweight.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Product> products = new ArrayList<>();
    private BigDecimal totalAmount = BigDecimal.ZERO;
    private BigDecimal tax = BigDecimal.ZERO;
    private BigDecimal transportationCost = BigDecimal.ZERO;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getTransportationCost() {
        return transportationCost;
    }

    public void setTransportationCost(BigDecimal transportationCost) {
        this.transportationCost = transportationCost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                ", totalAmount=" + totalAmount +
                ", tax=" + tax +
                ", transportationCost=" + transportationCost +
                '}';
    }
}

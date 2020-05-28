package structural.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TravelPackage implements Product {

    protected List<Product> children = new ArrayList<>();

    public TravelPackage( Product... products){
        add(products);
    }

    public void add(Product product) {
        children.add(product);
    }

    public void add(Product... products) {
        children.addAll(Arrays.asList(products));
    }

    public void remove(Product products) {
        children.remove(products);
    }

    public void remove(Product... products) {
        children.removeAll(Arrays.asList(products));
    }

    @Override
    public BigDecimal getCost() {
        BigDecimal cost = new BigDecimal(0);
        for( Product product : children){
            cost = cost.add(product.getCost());
        };
        return cost;
    }
}

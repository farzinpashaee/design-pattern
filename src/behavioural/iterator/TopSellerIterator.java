package behavioural.iterator;

import structural.flyweight.Product;

import java.util.ArrayList;
import java.util.List;

public class TopSellerIterator implements ProductIterator {

    List<Product> products;
    private int position = 0;

    public TopSellerIterator(List<Product> products){
        this.products = products;
        this.products.sort((o1, o2) -> o1.getPrice().compareTo(o2.getPrice()));
    }

    @Override
    public boolean hasNext() {
        if( products.size()>0 && products.size() > position ){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Product next() {
        Product p = this.products.get(position);
        position++;
        return p;
    }

    @Override
    public void reset() {
        position = 0;
    }
}

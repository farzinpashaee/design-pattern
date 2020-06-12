package behavioural.iterator;

import structural.flyweight.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {

    List<Product> products = new ArrayList<>();

    public void add( Product product){
        products.add(product);
    }

    public void get( int index ){
        products.get(index);
    }

    public ProductIterator getTopSellerIterator(){
        return new TopSellerIterator(this.products);
    }

}

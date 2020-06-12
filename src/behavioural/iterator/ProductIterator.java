package behavioural.iterator;

import structural.flyweight.Product;

public interface ProductIterator {

    public boolean hasNext();
    public Product next();
    public void reset();

}

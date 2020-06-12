package behavioural.iterator;

import structural.flyweight.Product;

import java.math.BigDecimal;
import java.util.Random;

public class TestRun {

    public static void main(String[] args) {

        ProductCollection productCollection = new ProductCollection();
        for(int i = 0; i< 10; i++){
            productCollection.add(new Product((long) i,"name " , new BigDecimal(Math.random()*1000) ));
        }

        ProductIterator productIterator = productCollection.getTopSellerIterator();
        while(productIterator.hasNext()){
            System.out.println(productIterator.next());
        }

    }
}

package behavioural.command;

import structural.flyweight.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestRun {

    public static void main(String[] args) {

        Order order = new Order();
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1L,"name1",new BigDecimal(10)));
        productList.add(new Product(2L,"name2",new BigDecimal(70)));
        order.setProducts(productList);

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.process(new TaxProcessCommand(order));
        orderProcessor.process(new TransportationProcessCommand(order));

        System.out.println(order);


    }

}

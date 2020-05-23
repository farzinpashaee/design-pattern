package creational.builder;

import java.math.BigDecimal;

public class TestRun {

    public static void main(String[] args) {

        try {
            Product p = new Product.ProductBuilder("name",new BigDecimal(1))
                    .description("some description")
                    .model("model")
                    .inventory(-1)
                    .build();

            //Product p2 = new Product();

            System.out.println(p.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

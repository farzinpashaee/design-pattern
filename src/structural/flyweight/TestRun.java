package structural.flyweight;

import java.math.BigDecimal;

public class TestRun {

    public static void main(String[] args) {

        for(int i = 0 ; i<2000; i++) {
            ProductCategory productCategory = ProductCategoryFactory.getProductCategory(1L,"category name","category des");
            Product p = new Product(1L,"product",new BigDecimal(10),productCategory);
        }

    }

}

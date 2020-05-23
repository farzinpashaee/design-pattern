package creational.builder;

import java.math.BigDecimal;

public class Product {

    private String name;
    private String description;
    private String model;
    private int inventory;
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getModel() {
        return model;
    }

    public int getInventory() {
        return inventory;
    }

    public BigDecimal getPrice() {
        return price;
    }

    private Product(ProductBuilder productBuilder){
        this.model = productBuilder.model;
        this.description = productBuilder.description;
        this.name = productBuilder.name;
        this.inventory = productBuilder.inventory;
        this.price = productBuilder.price;
    }

    public static class ProductBuilder{

        private String name;
        private String description;
        private String model;
        private int inventory;
        private BigDecimal price;

        public ProductBuilder( String name , BigDecimal price){
            this.name = name;
            this.price = price;
        }

        public Product build() throws Exception {
            if(inventory < 0 ) throw new Exception("inventory can not be less than -1");
            Product product = new Product(this);
            return product;
        }

        public ProductBuilder description(String description){
            this.description = description;
            return this;
        }

        public ProductBuilder model(String model){
            this.model = model;
            return this;
        }

        public ProductBuilder inventory(int inventory){
            this.inventory = inventory;
            return this;
        }


    }
}

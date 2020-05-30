package structural.flyweight;

import java.util.HashMap;

public class ProductCategoryFactory {

    private static HashMap<String, ProductCategory>  productCategories = new HashMap<>();

    public static ProductCategory getProductCategory(Long id, String name, String description){
        if(productCategories.get(name)==null){
            productCategories.put(name,new ProductCategory(id,name,description));
        }
        return productCategories.get(name);
    }

}

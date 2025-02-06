package util;

import java.util.function.Consumer;

import entities.Product;

public class ProductUpdate implements Consumer<Product> {

    @Override
    public void accept(Product t) {
        // TODO Auto-generated method stub
        t.setPrice(t.getPrice() * 1.1);
    }
    
}

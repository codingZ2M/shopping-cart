package com.codingz2m.shoppingcart.service;

import org.springframework.stereotype.Component;
import com.codingz2m.shoppingcart.model.Product;
import com.codingz2m.shoppingcart.model.ShoppingCart;

@Component
public class ShoppingCartServiceImpl implements ShoppingCartService {

	@Override
    public void addToCart(ShoppingCart cart, Product product) {
        cart.addProduct(product);
    }

    @Override
    public double calculateCartTotal(ShoppingCart cart) {
        double total = 0.0;
        for (Product product : cart.getProducts()) {
            total += product.getPrice();
        }
        return total;
    }
    
}

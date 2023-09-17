package com.codingz2m.shoppingcart.service;

import com.codingz2m.shoppingcart.model.Product;
import com.codingz2m.shoppingcart.model.ShoppingCart;

public interface ShoppingCartService {
	
    void addToCart(ShoppingCart cart, Product product);
    double calculateCartTotal(ShoppingCart cart);
    
}
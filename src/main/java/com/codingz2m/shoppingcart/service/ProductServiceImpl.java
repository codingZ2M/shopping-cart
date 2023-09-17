package com.codingz2m.shoppingcart.service;

import org.springframework.stereotype.Component;
import com.codingz2m.shoppingcart.model.Product;

@Component
public class ProductServiceImpl implements ProductService {

	@Override
    public Product findProductByName(String name) {
    	
        // Simulate finding a product from a database or repository
        // In a real-world application, you would query your database here
        Product product = new Product();
        product.setName(name);
        product.setPrice(500.0); // Set the price for demonstration purposes
        
        return product;
        
    }
}
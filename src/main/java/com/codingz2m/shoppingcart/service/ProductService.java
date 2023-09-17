package com.codingz2m.shoppingcart.service;

import com.codingz2m.shoppingcart.model.Product;

public interface ProductService {
	
    Product findProductByName(String name);
    
}
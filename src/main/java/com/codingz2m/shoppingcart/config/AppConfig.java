package com.codingz2m.shoppingcart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.codingz2m.shoppingcart.service.ProductService;
import com.codingz2m.shoppingcart.service.ProductServiceImpl;
import com.codingz2m.shoppingcart.service.ShoppingCartService;
import com.codingz2m.shoppingcart.service.ShoppingCartServiceImpl;

@Configuration
/* @Configuration annotation is used to indicate that the class is a configuration class 
 for the Spring application context.
 */
@ComponentScan(basePackages = "com.codingz2m.shoppingcart") // Specify the base package(s) to scan
public class AppConfig {
	/*
	@Bean
    public ProductService productService() {
        return new ProductServiceImpl();
    }
	
	@Bean
    public ShoppingCartService shoppingCartService() {
        return new ShoppingCartServiceImpl();
    }
*/	
}
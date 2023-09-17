package com.codingz2m.shoppingcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.codingz2m.shoppingcart.config.AppConfig;
import com.codingz2m.shoppingcart.model.Product;
import com.codingz2m.shoppingcart.model.ShoppingCart;
import com.codingz2m.shoppingcart.service.ProductService;
import com.codingz2m.shoppingcart.service.ShoppingCartService;

@SpringBootApplication
public class ShoppingCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartApplication.class, args);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProductService productService =	context.getBean(ProductService.class);
		
		Product product1 = productService.findProductByName("SLR 4K Camera");
		Product product2 = productService.findProductByName("Sports Shoe");

		ShoppingCart shoppingCart = new ShoppingCart();
		
		ShoppingCartService shoppingCartService = context.getBean(ShoppingCartService.class);
		
		shoppingCartService.addToCart(shoppingCart, product1);
		shoppingCartService.addToCart(shoppingCart, product2);
		
		double totalPrice = shoppingCartService.calculateCartTotal(shoppingCart);
		System.out.println("$ " + totalPrice);
		
	}

}

package com.DemoApp.MyBoot.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DemoApp.MyBoot.Service.ProductService;
import com.DemoApp.MyBoot.model.Product;

@RestController
 public class ProductController {
	
	@Autowired
	
	ProductService service;
	
	@GetMapping("/products")
	public List<Product> getProduct() {
		return service.getProducts();
	}
	
	@GetMapping("/products/{proId}")
	public Product getProductById(@PathVariable int proId) {
		return  service.getProductById(proId);
		
	}
	
	@PostMapping("/products")
	public void addProduct(@RequestBody Product pro) {
 		  service.addProduct(pro);
	}
	
	@PutMapping("/products")
	public void updateProduct(@RequestBody Product pro) {
		service.updateProduct(pro);
	}
	@DeleteMapping("/products/{proId}")
	public void deleteProduct(@PathVariable int proId) {
		service.deleteProduct(proId);
	}

}

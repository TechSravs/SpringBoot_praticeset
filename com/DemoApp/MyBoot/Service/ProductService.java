package com.DemoApp.MyBoot.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.DemoApp.MyBoot.model.Product;
import com.DemoApp.MyBoot.repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo repo;
	
//	List<Product> products=new ArrayList<>(Arrays.asList(
//			new Product(101,"Iphone",50000),
//			new Product(102,"camera",70000),
//			new Product(103,"shur mic",10000)));
//	
	public List<Product> getProducts(){
		return repo.findAll();
//	    return products;	
	}
	public Product getProductById(int proId) {
		return repo.findById(proId).orElse(new Product());
		
//		return products.stream()
//				.filter(p -> p.getProId() == proId)
//				.findFirst().orElse(new Product(100,"no item",0));
	}
	public void addProduct(Product pro) {
		  repo.save(pro);
//		products.add(pro);
		
	}
	public void updateProduct(Product pro) {
		repo.save(pro);
//		int index=0;
//		for(int i=0;i<products.size();i++) {
//			if(products.get(i).getProId() ==pro.getProId())
//				index=i;
//		}
//		products.set(index,pro);
	}
	public void deleteProduct(int proId) {
		repo.deleteById(proId);
//		int index=0;
//		for(int i=0;i<products.size();i++) {
//			if(products.get(i).getProId() == proId)
//				index=i;
//		}
//		products.remove(index);
		
	}
	
		
	}
	
	



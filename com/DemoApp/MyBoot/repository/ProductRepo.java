package com.DemoApp.MyBoot.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.DemoApp.MyBoot.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

	
	
	

}

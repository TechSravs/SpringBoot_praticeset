package com.DemoApp.MyBoot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Dev {
	
	
	
	@Autowired //field injection
	@Qualifier("laptop")
	 private Computer comp;
	
	//public Dev(Laptop laptop) {
		//this.l=l;
	//}
//	@Autowired
//	public void setLaptop(Laptop l) {
//		this.l=l;
//	}
	
	public void build() {
		
		comp.compile();
		
		System.out.println("working on awesome project");
	}

	
	

	
}

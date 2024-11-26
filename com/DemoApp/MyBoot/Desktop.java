package com.DemoApp.MyBoot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

	@Component
	@Primary
	public class Desktop implements Computer {
		
		public void compile() {
			System.out.println("compiling with 404 bugs but faster");
		}
	}




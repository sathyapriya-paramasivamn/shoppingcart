package com.niit.ShoppingKart.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	/*@RequestMapping("/")
	public String homePage(){
		
		
		return "home";
		
	}*/
	
	@RequestMapping("newCategry")
	public String newCategory(){
		
		return "categoryform";
	}
	@RequestMapping("home")
	public String homePage(){
		
		return "home";
	}
	@RequestMapping("newProduct")
	public String newProduct(){
		
		return "Productform";
	}
	@RequestMapping("newUser")
	public String newUser(){
		
		return "signup";
}
	@RequestMapping("newCart")
	public String newCart(){
		
		return "cartform";
	}
	@RequestMapping("newSupplier")
	public String newSupplier(){
		
		return "supplierform";
	}
	@RequestMapping("signin")
	public String signin(){
		
		return "signin";
	}


}
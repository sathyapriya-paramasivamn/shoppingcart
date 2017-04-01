package com.niit.ShoppingKart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.ShoppingKart.DAO.ProductDAO;
import com.niit.ShoppingKart.model.Product;;
@Controller
public class ProductController {
	
	@Autowired
	private ProductDAO productDAO;
	@RequestMapping("addProduct")
public String addProduct(@ModelAttribute Product product){
		
		productDAO.saveOrUpdate(product);
		
		return "viewProduct";
		}
}

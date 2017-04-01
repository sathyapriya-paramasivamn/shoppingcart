package com.niit.ShoppingKart.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.ShoppingKart.DAO.CategoryDAO;
import com.niit.ShoppingKart.model.Category;

@Controller
public class CategoryController {
	
	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping("addCategory")
	public String addCategory(@ModelAttribute Category category){
		
		categoryDAO.saveOrUpdate(category);
		
		return "viewCategory";
		
	}
}

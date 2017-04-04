package com.niit.ShoppingKart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.ShoppingKart.DAO.CartDAO;
import com.niit.ShoppingKart.model.Cart;

@Controller
public class CartController {
	@Autowired
	private CartDAO cartDAO;

	@RequestMapping("addCart")
	public String addCart(@ModelAttribute Cart cart) {
		 
		cartDAO.saveOrUpdate(cart);
		 
		return "viewCart";

	}
}

package com.niit.ShoppingKart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.niit.ShoppingKart.DAO.ShippingDAO;
import com.niit.ShoppingKart.model.Shipping;

@Controller
public class ShippingController {
	@Autowired
	private ShippingDAO shippingDAO;
public String addShipping(@ModelAttribute Shipping shipping){
		
		shippingDAO.saveOrUpdate(shipping);
		
		return "viewproduct";
		}

}

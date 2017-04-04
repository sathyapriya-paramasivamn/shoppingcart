package com.niit.ShoppingKart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.ShoppingKart.DAO.SupplierDAO;
import com.niit.ShoppingKart.model.Supplier;
@Controller
public class SupplierController {
	@Autowired
private SupplierDAO supplierDAO;
	@RequestMapping("addSupplier")
public String addSupplier(@ModelAttribute Supplier supplier){
		
		supplierDAO.saveOrUpdate(supplier);
		
		return "viewSupplier";
		}
}


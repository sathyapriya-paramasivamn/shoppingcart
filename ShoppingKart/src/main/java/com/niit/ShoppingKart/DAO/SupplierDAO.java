package com.niit.ShoppingKart.DAO;

import java.util.List;

import com.niit.ShoppingKart.model.Supplier;

public interface SupplierDAO {
public List<Supplier> list();
	
	public Supplier get(String supplierid);
	
	public void saveOrUpdate(Supplier supplierid);
	
	public void delete(String id);
}

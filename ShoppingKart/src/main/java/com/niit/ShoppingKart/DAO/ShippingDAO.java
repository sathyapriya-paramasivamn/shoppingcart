package com.niit.ShoppingKart.DAO;

import java.util.List;

import com.niit.ShoppingKart.model.Shipping;



public interface ShippingDAO {
public List<Shipping> list();
	
	public Shipping get(String shippingid);
	
	public void saveOrUpdate(Shipping shipping);
	
	public void delete(String shippingid);
}

package com.niit.ShoppingcartBackend.DAO;

import java.util.List;

import com.niit.ShoppingcartBackend.Model.Shipping;

public interface ShippingDAO {
	
	
	
	public List<Shipping> list();
	public Shipping getByUserid(String Userid);
	public Shipping getByUsername(String Username);
	public Shipping getBybillno(String billno);
	public Shipping getbyaddress(String address);
	public Shipping getbymobilenumber(long mobilenumber);
	public Shipping getbysupplierid(String supplierid);
	
	
	
}

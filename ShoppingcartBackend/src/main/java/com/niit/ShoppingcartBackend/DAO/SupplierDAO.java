package com.niit.ShoppingcartBackend.DAO;

import java.util.List;

import com.niit.ShoppingcartBackend.Model.Supplier;

public interface SupplierDAO {
	
	
	
	public List<Supplier> list();
	public Supplier getBysupplierid(String supplierid);
	public Supplier getBysupplier(String suppliername);
	public Supplier getByproductid(String productid);
	public Supplier getByproductname(String productname);
	public Supplier getBybillno(String billno);
	
}

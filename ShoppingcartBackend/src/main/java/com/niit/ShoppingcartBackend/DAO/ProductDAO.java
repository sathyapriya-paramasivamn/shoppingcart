package com.niit.ShoppingcartBackend.DAO;

import java.util.List;

import com.niit.ShoppingcartBackend.Model.Product;

public interface ProductDAO {
	public List<Product> list();
	public Product getByProductId(int ProductId);
	public Product getByProductName(String ProductName);
	public Product getByProductDescription(String ProductDescription);
	}

package com.niit.ShoppingcartBackend.DAO;

import java.util.List;

import com.niit.ShoppingcartBackend.Model.Wishlist;

public interface WishlistDAO {
	
	public List<Wishlist>list();
	public Wishlist getByUserid(String Userid);
	public Wishlist getByUsername(String Username);
	public Wishlist getByproductid(String productid);
	public Wishlist getByproductname(String productname);

}
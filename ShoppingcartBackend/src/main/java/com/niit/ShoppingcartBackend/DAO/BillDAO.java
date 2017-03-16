package com.niit.ShoppingcartBackend.DAO;

import java.util.List;

import com.niit.ShoppingcartBackend.Model.Bill;
public interface BillDAO {
	public List<Bill> list();
	public Bill getByBillno(String billno);
	public Bill getByUserid(String Userid);
	public Bill getByUsername(String Username);
	public Bill getByproductId(String productId);
	public Bill getBypaymantmode(String paymantmode);
	public Bill getByamount(String amount);
	
	
}

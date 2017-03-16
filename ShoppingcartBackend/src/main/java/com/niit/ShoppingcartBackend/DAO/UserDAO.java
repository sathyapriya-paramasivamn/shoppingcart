package com.niit.ShoppingcartBackend.DAO;

import java.util.List;

import com.niit.ShoppingcartBackend.Model.User;

public interface UserDAO {
	public List<User> list();
	public User getByUserid(String Userid);
	public User getByUsername(String Username);
	public User getByUserpassword(String Userpassword);
	public User getByUserMailid(String Mailid);
	public User getByUsermobilenumber(String mobilenumber);
	public User getByUserLocation(String Location);
	public User getByUserDOB(String DOB);
	public User getByUserrole(String role);
	public void SaveorUpdate(User user);
	public void Delete(User user);
	
	

}

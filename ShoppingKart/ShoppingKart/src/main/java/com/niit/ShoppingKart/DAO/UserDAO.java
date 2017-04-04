package com.niit.ShoppingKart.DAO;

import java.util.List;

import com.niit.ShoppingKart.model.User;

public interface UserDAO {
	public List<User> list();

	public User get(String userid);

	public void saveOrUpdate(User user);

	public void delete(String userid);


}

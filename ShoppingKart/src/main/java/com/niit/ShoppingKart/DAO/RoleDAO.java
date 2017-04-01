package com.niit.ShoppingKart.DAO;

import java.util.List;

import com.niit.ShoppingKart.model.Role;

public interface RoleDAO {

public List<Role> list();
	
	public Role get(String userid);
	
	public void saveOrUpdate(Role role);
	
	
	

}

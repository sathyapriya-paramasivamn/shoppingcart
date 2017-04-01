package com.niit.ShoppingKart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.ShoppingKart.DAO.RoleDAO;
import com.niit.ShoppingKart.DAO.UserDAO;
import com.niit.ShoppingKart.model.Role;
import com.niit.ShoppingKart.model.User;
@Controller
public class UserController {
	
	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private RoleDAO roleDAO;
	
	@Autowired
	private Role role;
	
	

	@RequestMapping("addUser")
	public String addCategory(@ModelAttribute User user){
		
		user.setEnabled(true);
		role.setMailid(user.getMailid());
		role.setRole("ROLE_USER");
		role.setUsername(user.getUsername());
		
		
		user.setRole(role);
		role.setUser(user);		
		
		userDAO.saveOrUpdate(user);
		roleDAO.saveOrUpdate(role);
		
		return "viewUser";
}
}
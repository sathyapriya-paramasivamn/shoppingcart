package com.niit.ShoppingKart.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ShoppingKart.model.User;

public class UserDAOImpl implements UserDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	public List<User> list() {
		@SuppressWarnings({ "unchecked" })
		List<User> listUser = (List<User>) sessionFactory.getCurrentSession().createCriteria(User.class)
		.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listUser;
	}
	@Transactional
	public User get(String userid) {
		String hql = "from User where userid ='" + userid + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) (query).list();

		if (listUser != null && !listUser.isEmpty()) {
			return listUser.get(0);
		}

		return null;
	}
	@Transactional
	public void saveOrUpdate(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);	
	}
	@Transactional
	public void delete(String userid) {
		User userToDelete = new User();
		userToDelete.setUserid(userid);
		sessionFactory.getCurrentSession().delete(userToDelete);
		
	}

}

package com.niit.ShoppingKart.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ShoppingKart.model.Role;
@Repository("RoleDAO")
public class RoleDAOImpl implements RoleDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public RoleDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Role> list() {
		@SuppressWarnings("unchecked")
		List<Role> listRole = (List<Role>) 
		sessionFactory.getCurrentSession().createCriteria(Role.class)
		.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listRole;
	}

	@Transactional
	public Role get(String userid) {
		String hql = "from Role where userid ='" + userid + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Role> listRole = (List<Role>) (query).list();
		if (listRole != null && !listRole.isEmpty()) {
			return listRole.get(0);
		}
		return null;
	}

	@Transactional
	public void saveOrUpdate(Role role) {
		sessionFactory.getCurrentSession().saveOrUpdate(role);

	}

}
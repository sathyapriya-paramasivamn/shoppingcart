package com.niit.ShoppingKart.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ShoppingKart.model.Cart;

@Repository("CartDAO")
public class CartDAOImpl implements CartDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public CartDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Cart> list() {
		@SuppressWarnings({ "unchecked" })
		List<Cart> listCart = (List<Cart>) sessionFactory.getCurrentSession().createCriteria(Cart.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listCart;
	}

	@Transactional
	public Cart get(String cartid) {
		String hql = "from Cart where cartid ='" + cartid + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Cart> listCart = (List<Cart>) (query).list();

		if (listCart != null && !listCart.isEmpty()) {
			return listCart.get(0);
		}

		return null;
	}

	@Transactional
	public void saveOrUpdate(Cart cart) {

		sessionFactory.getCurrentSession().saveOrUpdate(cart);
	}

	@Transactional
	public void delete(String cartid) {
		Cart cartToDelete = new Cart();
		cartToDelete.setCartid(cartid);
		sessionFactory.getCurrentSession().delete(cartToDelete);

	}

}

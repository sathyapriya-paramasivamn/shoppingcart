package com.niit.ShoppingKart.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ShoppingKart.model.Product;
@Repository("ProductDAO")
public class ProductDAOImpl implements ProductDAO{
	@Autowired
	private SessionFactory sessionFactory;

	public ProductDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	public List<Product> list() {
		@SuppressWarnings({ "unchecked" })
		List<Product> listProduct = (List<Product>) sessionFactory.getCurrentSession().createCriteria(Product.class)
		.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listProduct;
			}
	@Transactional
	public Product get(String productid) {
		String hql = "from Product where productid ='" + productid + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Product> listProduct = (List<Product>) (query).list();

		if (listProduct != null && !listProduct.isEmpty()) {
			return listProduct.get(0);
		}
		return null;
	}
	@Transactional
	public void saveOrUpdate(Product product) {
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		
	}
	@Transactional
	public void delete(String productid) {
		Product productToDelete = new Product();
		productToDelete.setProductid(productid);
		sessionFactory.getCurrentSession().delete(productToDelete);
	}

}

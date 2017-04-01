package com.niit.ShoppingKart.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.ShoppingKart.DAO.CartDAO;
import com.niit.ShoppingKart.DAO.CartDAOImpl;
import com.niit.ShoppingKart.DAO.CategoryDAO;
import com.niit.ShoppingKart.DAO.CategoryDAOImpl;
import com.niit.ShoppingKart.DAO.ProductDAO;
import com.niit.ShoppingKart.DAO.ProductDAOImpl;
//import com.niit.ShoppingKart.DAO.RoleDAO;
//import com.niit.ShoppingKart.DAO.RoleDAOImpl;
import com.niit.ShoppingKart.DAO.ShippingDAO;
import com.niit.ShoppingKart.DAO.ShippingDAOImpl;
import com.niit.ShoppingKart.DAO.SupplierDAO;
import com.niit.ShoppingKart.DAO.SupplierDAOImpl;
import com.niit.ShoppingKart.DAO.UserDAO;
import com.niit.ShoppingKart.DAO.UserDAOImpl;
import com.niit.ShoppingKart.model.Cart;
import com.niit.ShoppingKart.model.Category;
import com.niit.ShoppingKart.model.Product;
import com.niit.ShoppingKart.model.Role;
import com.niit.ShoppingKart.model.Shipping;
import com.niit.ShoppingKart.model.Supplier;
import com.niit.ShoppingKart.model.User;

@Configuration
@ComponentScan("com.niit.ShoppingKart")
@EnableTransactionManagement
public class ApplicationContextConfig {

	@Autowired
	@Bean(name = "dataSource")
	public DataSource getH2DataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/ShoppingKart");

		dataSource.setUsername("sa");
		dataSource.setPassword("");

		return dataSource;
	}

	private Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		properties.put("hibernate.format_sql", "true");

		return properties;
	}
	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.addAnnotatedClass(Category.class);
		sessionBuilder.addAnnotatedClass(Product.class);
		sessionBuilder.addAnnotatedClass(User.class);
		sessionBuilder.addAnnotatedClass(Cart.class);
		sessionBuilder.addAnnotatedClass(Supplier.class);
		sessionBuilder.addAnnotatedClass(Shipping.class);
		sessionBuilder.addAnnotatedClass(Role.class);
		return sessionBuilder.buildSessionFactory();
	} 
	
	
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;

	}

	@Autowired(required = true)
		@Bean(name = "CategoryDAO")
		public CategoryDAO getCategoryDAO(SessionFactory sessionFactory) {
			return new CategoryDAOImpl(sessionFactory);
		}
	@Autowired(required = true)
	@Bean(name = "ProductDAO")
	public ProductDAO getProductDAO(SessionFactory sessionFactory) {
		return new ProductDAOImpl(sessionFactory);
	}
	@Autowired(required = true)
	@Bean(name = "UserDAO")
	public UserDAO getUserDAO(SessionFactory sessionFactory) {
		return new UserDAOImpl(sessionFactory);
	}
	@Autowired(required = true)
	@Bean(name = "SupplierDAO")
	public SupplierDAO getSupplierDAO(SessionFactory sessionFactory) {
		return new SupplierDAOImpl(sessionFactory);
	}
	@Autowired(required = true)
	@Bean(name = "ShippingDAO")
	public ShippingDAO getShippingDAO(SessionFactory sessionFactory) {
		return new ShippingDAOImpl(sessionFactory);
	}
	@Autowired(required = true)
	@Bean(name = "CartDAO")
	public CartDAO getCartDAO(SessionFactory sessionFactory) {
		return new CartDAOImpl(sessionFactory);
	}
	/*@Autowired(required=true)
	@Bean(name="RoleDAO")
	public RoleDAO getRoleDAO(SessionFactory sessionFactory)
	{
		return new RoleDAOImpl(sessionFactory);
	}*/
}

package com.niit.ShoppingKart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "Product")
@Component
public class Product {

@Id
@Column(name="productid")
@GeneratedValue
	
private String productid;
public String getProductid() {
	return productid;
}
public void setProductid(String productid) {
	this.productid = productid;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductdescription() {
	return productdescription;
}
public void setProductdescription(String productdescription) {
	this.productdescription = productdescription;
}
private String productName;
private String productdescription;
	
}

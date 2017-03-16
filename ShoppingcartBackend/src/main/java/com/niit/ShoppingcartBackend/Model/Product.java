package com.niit.ShoppingcartBackend.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table(name="Product")
@Entity
@Component


public class Product {

private int productId;
private String productName;
private String productDetails;

public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductDetails() {
	return productDetails;
}
public void setProductDetails(String productDetails) {
	this.productDetails = productDetails;
}
  
}

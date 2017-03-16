package com.niit.ShoppingcartBackend.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table(name="Bill")
@Entity
@Component

public class Bill {
private String billno;
private String Userid;
private String Username;
private String productId;
private String paymantmode;
private String amount;
public String getUserid() {
	return Userid;
}
public void setUserid(String userid) {
	Userid = userid;
}

public String getBillno() {
	return billno;
}
public void setBillno(String billno) {
	this.billno = billno;
}
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	this.productId = productId;
}
public String getPaymantmode() {
	return paymantmode;
}
public void setPaymantmode(String paymantmode) {
	this.paymantmode = paymantmode;
}
public String getAmount() {
	return amount;
}
public void setAmount(String amount) {
	this.amount = amount;
}





}

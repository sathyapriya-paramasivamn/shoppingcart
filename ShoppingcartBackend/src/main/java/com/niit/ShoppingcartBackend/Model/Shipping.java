package com.niit.ShoppingcartBackend.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table(name="Shipping")
@Entity
@Component
public class Shipping {
private String Userid;
private String Username;
private String billno;
private String address;
private long mobilenumber;
private String supplierid;
public String getSupplierid() {
	return supplierid;
}
public void setSupplierid(String supplierid) {
	this.supplierid = supplierid;
}
public String getSuppliername() {
	return suppliername;
}
public void setSuppliername(String suppliername) {
	this.suppliername = suppliername;
}
private String suppliername;
public String getUserid() {
	return Userid;
}
public void setUserid(String userid) {
	Userid = userid;
}
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getBillno() {
	return billno;
}
public void setBillno(String billno) {
	this.billno = billno;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(long mobilenumber) {
	this.mobilenumber = mobilenumber;
}




	
	
}

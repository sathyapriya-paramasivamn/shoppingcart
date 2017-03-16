package com.niit.ShoppingcartBackend.Model;

public class Supplier {
	private String supplierid;
	private String suppliername;
	private String productid;
	private String productname;
	private String billno;
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
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getBillno() {
		return billno;
	}
	public void setBillno(String billno) {
		this.billno = billno;
	}
	public String getShippingno() {
		return shippingno;
	}
	public void setShippingno(String shippingno) {
		this.shippingno = shippingno;
	}
	private String shippingno;
	
	
	

}

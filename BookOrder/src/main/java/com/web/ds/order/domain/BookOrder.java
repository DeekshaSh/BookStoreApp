package com.web.ds.order.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book_order")
public class BookOrder {

	@Id
	private String orderId;

	private Date orderDate;
	private float orderAmount;
	private String userId;
	private Date estDeliveryDate;	
	private boolean isPaid;
	private String paymentMode;
	private String shippingAddress;
	//private List<String> bookIdProductList;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public float getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(float orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getEstDeliveryDate() {
		return estDeliveryDate;
	}
	public void setEstDeliveryDate(Date estDeliveryDate) {
		this.estDeliveryDate = estDeliveryDate;
	}
	public boolean isPaid() {
		return isPaid;
	}
	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	/*
	 * public List<String> getBookIdProductList() { return bookIdProductList; }
	 * public void setBookIdProductList(List<String> bookIdProductList) {
	 * this.bookIdProductList = bookIdProductList; }
	 */
	
	
	
	
	

}

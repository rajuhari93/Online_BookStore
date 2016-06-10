package com.newstore.domain;

import java.util.Date;

public class Order {

	private int orderId;
	private Date orderDate;
	private float totalPrice;
	
	public Order(int orderId, Date orderDate, float totalPrice) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.totalPrice = totalPrice;
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return String.format("Order [orderId=%s, orderDate=%s, totalPrice=%s]", orderId, orderDate, totalPrice);
	}
	

}

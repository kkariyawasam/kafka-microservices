package com.example.common;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable {
	private String orderId;
	private String userId;
	private List<String> items;
	private double amount;
	private String status;

	public String getOrderId() {
		return orderId;
	}

	public Order() {
		
	}

	public Order(String orderId, String userId, List<String> items, double amount, String status) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.items = items;
		this.amount = amount;
		this.status = status;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	// Constructors

}

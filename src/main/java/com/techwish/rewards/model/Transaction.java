package com.techwish.rewards.model;

public class Transaction {
	private int id;
	private int customerId;
	private String merchantId;
	private float amount;
	private String date;	
	
	
	public Transaction(int customerId, String merchantId, float amount, String date) {
		super();
		this.customerId = customerId;
		this.merchantId = merchantId;
		this.amount = amount;
		this.date = date;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", customerId=" + customerId + ", merchantId=" + merchantId + ", amount="
				+ amount + ", date=" + date + "]";
	}
}
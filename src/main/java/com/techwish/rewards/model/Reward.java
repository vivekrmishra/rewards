package com.techwish.rewards.model;

public class Reward {

	private int id;
	private int rewardsPoints;
	private String rewardsDate;
	private int customerId;
	private int transactionId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRewardsPoints() {
		return rewardsPoints;
	}
	public void setRewardsPoints(int rewardsPoints) {
		this.rewardsPoints = rewardsPoints;
	}
	public String getRewardsDate() {
		return rewardsDate;
	}
	public void setRewardsDate(String rewardsDate) {
		this.rewardsDate = rewardsDate;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	@Override
	public String toString() {
		return "Reward [id=" + id + ", rewardsPoints=" + rewardsPoints + ", rewardsDate=" + rewardsDate
				+ ", customerId=" + customerId + ", transactionId=" + transactionId + "]";
	}
	
}
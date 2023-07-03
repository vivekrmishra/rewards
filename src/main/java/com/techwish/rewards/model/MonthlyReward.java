package com.techwish.rewards.model;

public class MonthlyReward {
	
	private String customerName;
	private String rewardMonth;
	private int monthlyRewardPoints;
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getRewardMonth() {
		return rewardMonth;
	}
	public void setRewardMonth(String rewardMonth) {
		this.rewardMonth = rewardMonth;
	}
	public int getMonthlyRewardPoints() {
		return monthlyRewardPoints;
	}
	public void setMonthlyRewardPoints(int monthlyRewardPoints) {
		this.monthlyRewardPoints = monthlyRewardPoints;
	}

	@Override
	public String toString() {
		return "RewardSummary [customerName=" + customerName + ", rewardMonth=" + rewardMonth + ", monthlyRewardPoints="
				+ monthlyRewardPoints + "]";
	}
}

package com.techwish.rewards.service;

import com.techwish.rewards.model.YearlyReward;

public interface RewardService {
	
	public YearlyReward getCustomerReward(Integer customerId, String customerName);
	
}
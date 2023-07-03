package com.techwish.rewards.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techwish.rewards.dao.RewardsDAO;
import com.techwish.rewards.exception.RecordNotFoundException;
import com.techwish.rewards.model.MonthlyReward;
import com.techwish.rewards.model.YearlyReward;

@Service
public class RewardServiceImpl implements RewardService {
	
	@Autowired
	RewardsDAO rewardsDAO;
	
	@Override
	public YearlyReward getCustomerReward(Integer customerId, String customerName) {
		
		YearlyReward yearlyReward = null;
		List<MonthlyReward> monthlyRewards = null;

		int totalRewards = 0;
		if (customerId != null) {
			monthlyRewards = rewardsDAO.getCustomerReward(customerId);
		} else if (customerName != null) {
			monthlyRewards = rewardsDAO.getCustomerReward(customerName);
		}
		
		if (monthlyRewards.size() > 0) {
			totalRewards = monthlyRewards.stream().mapToInt(reward -> reward.getMonthlyRewardPoints()).sum();
			yearlyReward = new YearlyReward(monthlyRewards, totalRewards);
		} else {
			throw new RecordNotFoundException() ;
		}
		return yearlyReward;
	}
}
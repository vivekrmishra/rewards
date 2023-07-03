package com.techwish.rewards.dao;

import java.util.List;

import com.techwish.rewards.model.MonthlyReward;
import com.techwish.rewards.model.Reward;

public interface RewardsDAO {

    public int insertReward(Reward reward);

	public List<MonthlyReward> getCustomerReward(int customerId);

	public List<MonthlyReward> getCustomerReward(String customerName);

	public List<MonthlyReward> getCustomerReward();    
}

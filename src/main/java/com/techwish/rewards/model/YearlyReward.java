package com.techwish.rewards.model;

import java.util.List;

public class YearlyReward {
	
	private List<MonthlyReward> mothlyReward = null;
	private int totalRewardPoints;	
	
	public YearlyReward(List<MonthlyReward> mothlyReward, int totalRewardPoints) {
		super();
		this.mothlyReward = mothlyReward;
		this.totalRewardPoints = totalRewardPoints;
	}

	public List<MonthlyReward> getMothlyReward() {
		return mothlyReward;
	}

	public int getTotalRewarPoints() {
		return totalRewardPoints;
	}

	@Override
	public String toString() {
		return "YearlyReward [mothlyReward=" + mothlyReward + ", totalRewardPoints=" + totalRewardPoints + "]";
	}
	
	
}

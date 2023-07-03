package com.techwish.rewards.business;

import org.springframework.stereotype.Component;

@Component
public class RewardsCalculator {
	
	public static int calculateRewards (int amount) {
		int rewards = 0;
		if (amount > 100) {
			rewards = ((amount - 100) * 2) + 50;			
		} else if (amount > 50) {
			rewards = amount - 50;
		}
		return rewards;
	}

}

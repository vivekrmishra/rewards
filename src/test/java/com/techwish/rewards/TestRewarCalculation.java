package com.techwish.rewards;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.techwish.rewards.business.RewardsCalculator;

@RunWith(MockitoJUnitRunner.class)
public class TestRewarCalculation {
	
	@Test
	public void testRewardsCalculation() {
		assertEquals(90, RewardsCalculator.calculateRewards(120));
	}
}

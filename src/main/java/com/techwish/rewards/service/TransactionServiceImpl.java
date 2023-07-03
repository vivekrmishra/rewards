package com.techwish.rewards.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techwish.rewards.business.RewardsCalculator;
import com.techwish.rewards.dao.RewardsDAO;
import com.techwish.rewards.dao.TransactionsDAO;
import com.techwish.rewards.model.Reward;
import com.techwish.rewards.model.Transaction;

@Service
public class TransactionServiceImpl implements TransactionService {
	
	@Autowired
	TransactionsDAO transactionDAO;
	
	@Autowired
	RewardsDAO rewardsDAO;
	
	@Override
	@Transactional
	public Reward insertTransaction(Transaction transaction) {
		int transactionId = transactionDAO.insertTransaction(transaction);
		
		Reward reward = new Reward();
		reward.setRewardsDate(transaction.getDate());
		reward.setRewardsPoints(RewardsCalculator.calculateRewards((int) transaction.getAmount()));
		reward.setTransactionId(transactionId);
		reward.setCustomerId(transaction.getCustomerId());
		rewardsDAO.insertReward(reward);
		return reward;
	}
}
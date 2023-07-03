package com.techwish.rewards.service;

import com.techwish.rewards.model.Reward;
import com.techwish.rewards.model.Transaction;

public interface TransactionService {
	
	public Reward insertTransaction(Transaction transaction);

}
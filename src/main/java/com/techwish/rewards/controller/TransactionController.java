package com.techwish.rewards.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techwish.rewards.model.Transaction;
import com.techwish.rewards.service.TransactionService;

@RestController
@RequestMapping("/test")
public class TransactionController {
	
	@Autowired
	TransactionService transactionService;

	@PostMapping("/transaction")
	private ResponseEntity<Object> insertTransaction(@RequestBody Transaction transaction) {
		
		transactionService.insertTransaction(transaction);
		return new ResponseEntity<> (HttpStatus.OK);
	}
}

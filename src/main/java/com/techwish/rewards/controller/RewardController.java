package com.techwish.rewards.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techwish.rewards.service.RewardService;

@RestController
@RequestMapping("/test")
public class RewardController {
	
	@Autowired
	RewardService rewardService;

	@GetMapping("/customer/getRewards")
	private ResponseEntity<Object> getCustomerReward(@RequestParam(required = false) Integer customerId, 
			@RequestParam(required = false) String customerName) {
		if ((customerId == null && customerName == null) || 
				((customerId != null && customerId.toString().trim().length() == 0) || (customerName!=null && customerName.trim().length() == 0))) {
			return new ResponseEntity<> (HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<> (rewardService.getCustomerReward(customerId, customerName), HttpStatus.OK);
	}
}

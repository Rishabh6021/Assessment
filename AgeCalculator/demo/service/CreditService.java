package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repos.CreditRepository;



@Service
public class CreditService {
	
	@Autowired
	CreditRepository repo1;
	public int validateCardDetails(String credit_card_number,String expiry_date,String cvv_number) {
		// TODO Auto-generated method stub
		return repo1.validate(credit_card_number,expiry_date,cvv_number);
	}

}

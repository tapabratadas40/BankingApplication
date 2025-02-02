package com.banking.BankingApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.BankingApplication.entity.User;
import com.banking.BankingApplication.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	public List<User> getListOfUser() {
		// TODO Auto-generated method stub
		
		return userRepo.findAll();
	}

}

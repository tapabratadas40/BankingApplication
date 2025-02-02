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

	public User createUser(User user) {
		User save = userRepo.save(user);
		return save;
	}
	
	public User updateUser(Integer id,User user) {
		User findUser = userRepo.findById(id);
		if(findUser!=null) {
			findUser.setEmail(user.getEmail());
			findUser.setFirstName(user.getFirstName());
			findUser.setLastName(user.getLastName());
		}
		User updatedUser = userRepo.save(findUser);
		return updatedUser;
	}
}

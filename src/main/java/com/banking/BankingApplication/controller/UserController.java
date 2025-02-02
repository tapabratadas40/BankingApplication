package com.banking.BankingApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.BankingApplication.entity.User;
import com.banking.BankingApplication.service.UserService;

@RestController("/")
public class UserController {
	
	@Autowired
	UserService userService;
	@GetMapping("users")
	public List<User> getListOfUser(){
		
		List<User> userList = userService.getListOfUser();
		return userList;
	}
}

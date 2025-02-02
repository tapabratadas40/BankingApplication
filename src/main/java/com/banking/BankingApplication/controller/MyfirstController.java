package com.banking.BankingApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyfirstController {
	@RequestMapping("/")
	public void myFirstController() {
		System.out.println("akash");
	}
	

}

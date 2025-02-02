package com.banking.BankingApplication.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

//import org.springframework.data.annotation.Id;

@Entity
public class User {

	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private long balance;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public User(Integer id, String firstName, String lastName, long balance) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}
	public User() {}
	
	
}

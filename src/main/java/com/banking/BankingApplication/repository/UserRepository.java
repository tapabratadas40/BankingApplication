package com.banking.BankingApplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.BankingApplication.entity.User;

public interface UserRepository extends JpaRepository<User,String> {

	User findById(Integer id);

	List<User> findAllById(Integer id);

}

package com.springboot.microservice.closh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.microservice.closh.entity.Signup;

public interface SignupRepository extends JpaRepository<Signup,Integer> {
	
	Signup findByEmail(String email);
	   
}
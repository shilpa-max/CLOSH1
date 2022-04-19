package com.springboot.microservice.closh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.microservice.closh.entity.Signup;
import com.springboot.microservice.closh.repository.SignupRepository;

@Service
public class SignupService {
    @Autowired
    private SignupRepository repository;

    public Signup saveSignup(Signup signup) {
        return repository.save(signup);
    }

    public List<Signup> saveSignup(List<Signup> signup) {
        return repository.saveAll(signup);
    }

    public List<Signup> getSignup() {
        return repository.findAll();
    }

    public Signup getSignupById(int id) {
        return repository.findById(id).orElse(null);
    }

//    public Signup getSignupByTitle(String title) {
//        return repository.findByTitle(title);
//    }

    public String deleteSignup(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

//    public Signup updateSignup(Signup signup) {
//    	Signup existingSignup = repository.findById(signup.getId()).orElse(null);
//        existingSignup.setUsername(signup.getUsername());
//        existingSignup.setAddress(signup.getAddress());
//        existingSignup.setEmail(signup.getEmail());
//        existingSignup.setPassword(signup.getPassword());
//        existingSignup.setPhone(signup.getPhone());
    public Signup updateSignup(Signup signup) {
    	Signup existingsignup = repository.findByEmail(signup.getEmail());
    	 existingsignup.setPassword(signup.getPassword());
       
        return repository.save(existingsignup);
    }


}

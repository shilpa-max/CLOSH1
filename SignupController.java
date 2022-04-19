package com.springboot.microservice.closh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.microservice.closh.entity.Signup;
import com.springboot.microservice.closh.service.SignupService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class SignupController {

    @Autowired
    private  SignupService service;

    @PostMapping("/addSignup")
    public  Signup addSignup(@RequestBody Signup  signup) {
        return service.saveSignup( signup);
    }

//    @PostMapping("/addSignups")
//    public List< Signup> addSignup(@RequestBody List< Signup>  signup) {
//        return service.saveSignup( signup);
//    }

    @GetMapping("/addSignup")
    public List< Signup> findAllSignup() {
        return service.getSignup();
    }

    @GetMapping("/addSignup/{id}")
    public  Signup findSignupById(@PathVariable int id) {
        return service.getSignupById(id);
    }

//    @GetMapping("/ Signup/{title}")
//    public  Signup findSignupByTitle(@PathVariable String title) {
//        return service.getSignupByTitle(title);
//    }

    @PutMapping("/update")
    public  Signup updateSignup(@RequestBody  Signup  signup) {
        return service.updateSignup(signup);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSignup(@PathVariable int id) {
        return service.deleteSignup(id);
    }

}
package com.springboot.microservice.closh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.microservice.closh.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByTitle(String title);//java persistance api
}
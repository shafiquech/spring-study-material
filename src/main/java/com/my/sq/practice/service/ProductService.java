package com.my.sq.practice.service;

import com.my.sq.practice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductService extends JpaRepository<Product, Long> {

}

package com.example.curso.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curso.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

}

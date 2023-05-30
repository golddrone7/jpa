package com.study.jpa.chap01_basic.repository;


import com.study.jpa.chap01_basic.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {  // (제너릭, PK타입)
    // insert, delete... 다 만들어져있음

}

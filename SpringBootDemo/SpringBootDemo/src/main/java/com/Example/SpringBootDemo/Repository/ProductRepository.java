package com.Example.SpringBootDemo.Repository;

import com.Example.SpringBootDemo.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}

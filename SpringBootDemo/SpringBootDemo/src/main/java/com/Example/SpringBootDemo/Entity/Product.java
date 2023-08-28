package com.Example.SpringBootDemo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Product_Details")
public class Product {
    @Id
    @GeneratedValue
     int id;
     String name;
    String type;
}

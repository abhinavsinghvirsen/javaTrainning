package com.Example.SpringBootDemo.Service;

import com.Example.SpringBootDemo.Entity.Product;
import com.Example.SpringBootDemo.Repository.ProductRepository;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
    public Product saveProd(Product product){
      return repository.save(product);
    }
    public List<Product> saveAllProduct(List<Product> products){
        return repository.saveAll(products);
    }
    public Product findById(int id){
        return repository.findById(id).orElse(null);
    }
    public List<Product> findAll(){
        return repository.findAll();
    }
    public Product getProdByName(String name){
        return repository.findByName(name);
    }
    public String deleteById(int id){
      repository.deleteById(id);
      return "Product Deleted";
    }
    public Product updateByName(Product product){
        Product existingProd=repository.findById(product.getId()).orElse(null);
        existingProd.setName(product.getName());
       // existingProd.setId(product.getId());
        existingProd.setType(product.getType());
        return repository.save(existingProd);
    }


}

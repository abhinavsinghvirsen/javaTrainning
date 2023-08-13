package com.Example.SpringBootDemo.Controller;

import com.Example.SpringBootDemo.Entity.Product;
import com.Example.SpringBootDemo.Repository.ProductRepository;
import com.Example.SpringBootDemo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
   private ProductService service;
    @PostMapping("/addProd")
    public Product addProd(@RequestBody Product product){
        return service.saveProd(product);
    }
    @PostMapping("/addAllProd")
    public List<Product> addProducts(@RequestBody List<Product> productList){
        return service.saveAllProduct(productList);
    }
    @GetMapping("/getId/{id}")
    public Product findProdById(@PathVariable int id){
        return service.findById(id);
    }
    @GetMapping("/findAll")
    public List<Product> findAllProd(){
        return service.findAll();
    }
    @GetMapping("/findByName/{name}")
    public Product findProdByName(@PathVariable String name){
        return service.getProdByName(name);
    }
    @DeleteMapping("delete/{id}")
    public String deleteById(@PathVariable int id){
       return service.deleteById(id);


    }
    @PutMapping("/update")
    public Product updateByName(@RequestBody Product product){
        return service.updateByName(product);
    }

}
